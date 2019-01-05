/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import GameObject.*;
import Load.ClickSun;
import Load.LoadImage;
import Load.LoadSpace;
import Load.PlantTree;
import Load.Score;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class PvZGame extends Canvas implements Runnable {

    public static final String TITLE = "PvZ GAME!!!!!";
    public static final int WIDTH = 1550;
    public static final int HEIGHT = 1050;
    
    private final int sunFrequency=15;
    
    private boolean running;
    
    private NormalZombie n1;
    private FrostPeaShooter p1;
    
    LoadImage loadImage;
    LoadSpace loadspace;
    
    private long timeSun= System.currentTimeMillis();
    
    
    

    public PvZGame() {
        loadImage = new LoadImage();
        loadImage.loadImage();
        loadImage.loadAmination();
        
        
        loadspace.LoadSpaceTree();
        
        
        new Window(WIDTH, HEIGHT, TITLE, this);
        
        n1 = new NormalZombie();
      
        
        addMouseListener(new PlantTree());
        addMouseListener(new ClickSun());
        
    }

    
    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        new Thread(this, " PvZ-Thread ").start();
    }

    public  synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
    }

    private void tick() {
        Handler.tick();
        createNewSun();

    }

    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        /////////////////////////////////////////////////
        g.drawImage(LoadImage.screenBackGound, 0, 0, null);
        Handler.render(g);
        /////////////////////////////////////////////////
        //Draw Score
        g.drawString(Integer.toString(Score.score), 96, 100);
        /////////////////////////////////////////////////
        // DRAW TREE CARD
        g.drawImage(LoadImage.originPeaShooter,190,10,null);
        g.drawImage(LoadImage.originFrostPeaShooter, 260,10,null);
        g.drawImage(LoadImage.originSunFlower, 330,10,null);

//        handler.render(g);
        /////////////////////////////////////////////////
        g.dispose();
        bs.show();

    }

    @Override
    public void run() {
        this.requestFocus();
        double target = 100;
        double nanoSecondPerTick = 1000000000.0 / target;
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        double unprocessed = 0.0;
        int fps = 0;
        int tps = 0;
        boolean canRender = false;

        while (running) {
            long now = System.nanoTime();
            unprocessed += (now - lastTime) / nanoSecondPerTick;
            lastTime = now;

            //Tick
            if (unprocessed >= 1.0) {               // Tick 1 time
                tick();
                unprocessed--;
                tps++;
                canRender = true;
            } else {
                canRender = false;
            }
            // Render
            if (canRender) {
                render();
                fps++;
            }
            if (System.currentTimeMillis() - 1000 > timer) {
                timer += 1000;
                System.out.printf("FPS : %d \t\t TPS : %d \n", fps, tps);
                fps = 0;
                tps = 0;
            }
        }
        System.exit(0);
    }
    public void createNewSun() {
        if (System.currentTimeMillis() - timeSun > sunFrequency*1000) {
            new Sun();
            timeSun=System.currentTimeMillis();
        }
    }

    
    
    public static void main(String[] args) {
        new PvZGame();
    }
}
