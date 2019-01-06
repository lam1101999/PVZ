/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

import java.awt.Graphics;

import Load.LoadImage;

/**
 *
 * @author Admin
 */
public class PeaShooter extends Plant {
	public final static int healthOfPeaShooter = 100;
	public  static int priceOfPeaShooter = 100;
	public final static int damageOfPeaShooter = 100;
	public final static double shootSpeedOfPeaShooter = 0.5;//number of bullet per second
	
	private double shootSpeed;
	private int damage;
	
	
	long time1 = System.currentTimeMillis();
	long time2 = System.currentTimeMillis();
	
    
    

    
    public PeaShooter(int x, int y) {
      this.x = x;
      this.y = y;
      health = healthOfPeaShooter;
      shootSpeed = shootSpeedOfPeaShooter;
      damage = damageOfPeaShooter;
      width = 100;
      height = 100;
    }

    @Override
    public void tick() {
    	if(System.currentTimeMillis() - time1>((1000/shootSpeed)/LoadImage.fullPeaShooter.getN())) {
    		LoadImage.fullPeaShooter.update();
    		time1 = System.currentTimeMillis();
    	}
    	checkCollision();
        remove();
    }

    @Override
    public void render(Graphics g) {
    	  g.drawImage(LoadImage.fullPeaShooter.getCurrentImage(), x, y, width, height, null);
    }

    public void checkCollision() {
    	for(int i = 0; i< Handler.ListZombie.size(); i++) {
    		if(this.getBound2().intersects( Handler.ListZombie.get(i).getBound())) {
    			shoot();
    			
    		}
    	}
    }

    private void shoot() {
        if (System.currentTimeMillis() - time2 > 1000/shootSpeed) {
            new NormalBullet(x, y, damage);
            time2 = System.currentTimeMillis();
        }
    }
}
