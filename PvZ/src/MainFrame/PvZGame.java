/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import GameObject.*;
import GameObject.Bullet.Sun;
import GameObject.Flower.FrostPeaShooter;
import GameObject.Zombie.*;
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
	private final int sunFrequency = 15;
	private final int normalZombieFrequency = 5;

	private boolean running;

	

	private Menu menu;

	LoadImage loadImage;
	LoadSpace loadspace;

	private long timeSun = System.currentTimeMillis();
	private long timeZombie = System.currentTimeMillis();

	public enum STATE {
		Menu, Game, End
	};

	public STATE gameState = STATE.Menu;

	public PvZGame() {
		loadImage = new LoadImage();
		loadImage.loadImage();
		loadImage.loadAmination();

		loadspace.LoadSpaceTree();

		new Window(WIDTH, HEIGHT, TITLE, this);
		menu = new Menu(this);

		Handler.reset();

		this.addMouseListener(menu);
		this.addMouseListener(new PlantTree());
		this.addMouseListener(new ClickSun());

	}

	public synchronized void start() {
		if (running) {
			return;
		}
		running = true;
		new Thread(this, " PvZ-Thread ").start();
	}

	public synchronized void stop() {
		if (!running) {
			return;
		}
		running = false;
	}

	private void tick() {
		if (gameState == STATE.Game) {
			Handler.tick();
			createNewSun();
			createNewZombie();
			checkGameEnd();
		}
		if (gameState == STATE.Menu || gameState == STATE.End) {
			menu.tick();
		}
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
		// Draw Score
		g.drawString(Integer.toString(Score.score), 96, 100);
		/////////////////////////////////////////////////

		if (gameState == STATE.Game) {
			///////////////////////////////////////////////////////// DRAW TREE CARD
			g.drawImage(LoadImage.originPeaShooter, 190, 10, 80, 100, null);
			g.drawImage(LoadImage.originFrostPeaShooter, 280, 10, 80, 100, null);
			g.drawImage(LoadImage.originSunFlower, 370, 10, 80, 100, null);
			g.drawImage(LoadImage.originWalNut, 460, 10, 80, 100, null);

		}
		if (gameState == STATE.Menu || gameState == STATE.End) {
			menu.render(g);
		}

//        handler.render(g);
		/////////////////////////////////////////////////
		g.dispose();
		bs.show();

	}

	public void checkGameEnd() {
		for (int i = 0; i < Handler.ListZombie.size(); i++) {
			GameObject tempObject = Handler.ListZombie.get(i);
			if (tempObject.getX() <= 0 - 20) {
				gameState = STATE.End;

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Handler.reset();
			}
		}
	}

	@Override
	public void run() {
		this.requestFocus();
		double target = 20;
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

			// Tick
			if (unprocessed >= 1.0) { // Tick 1 time
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
		if (System.currentTimeMillis() - timeSun > sunFrequency * 1000) {
			new Sun();
			timeSun = System.currentTimeMillis();
		}
	}

	public void createNewZombie() {
		int n = 0;

		if (System.currentTimeMillis() - timeZombie > normalZombieFrequency * 1000) {
			if (n <= 10) {
				new NormalZombie();
				n++;
			} else {
				new NormalZombie();
				new NormalZombie();
			}

			timeZombie = System.currentTimeMillis();
		}
	}

	

	public static void main(String[] args) {
		new PvZGame();
	}
}
