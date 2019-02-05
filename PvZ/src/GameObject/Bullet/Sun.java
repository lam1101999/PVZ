/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject.Bullet;

import Load.LoadImage;
import java.awt.Graphics;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Handler;

/**
 *
 * @author Admin
 */
public class Sun extends GameObject {

    int finalY;
    static long time = System.currentTimeMillis();
    
    public Sun(int x, int y) {
      this.x = x;
      this.y = y;
      finalY = y+50;
      width =100;
      height =100;
      Handler.ListSun.add(this);
    }
    public Sun() {
        x = randomX();
        y = 0;
        finalY = randomY();
    }

    @Override
    public void tick() {
        if (y <= finalY) {
            y += 5;
        
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(LoadImage.Sun, x, y, width, height, null);

    }

    public int randomX() {
        Random r = new Random();
        return r.nextInt(1300) + 100;
    }

    public int randomY() {
        Random r = new Random();
        int ranDomNumBer = r.nextInt(800) + 100;
        while(ranDomNumBer < y) {
        	ranDomNumBer = r.nextInt(800) + 100;
        }
        return ranDomNumBer;
    }

    @Override
    public void remove() {
        Handler.ListSun.remove(this);
    }

}
