package GameObject.Flower;

import java.awt.Graphics;

import GameObject.Bullet.Sun;
import Load.LoadImage;

public class SunFlower extends Plant {

	public final static int healthOfSunFlower = 100;
	public static int priceOfSunFlower = 50;
	public final static double produceSpeedOfSunFlower = 0.1;
	
	private double produceSpeed;
	
	long time1 = System.currentTimeMillis();
	long time2 = System.currentTimeMillis();
	
	public SunFlower(int x, int y) {
		 this.x = x;
	     this.y = y;
	     health = healthOfSunFlower;
	     produceSpeed = produceSpeedOfSunFlower;
	     width = 100;
	     height = 100;
	     
	}

	@Override
	public void tick() {
		if(System.currentTimeMillis() - time1>((1000/produceSpeed)/LoadImage.fullFrostPeaShooter.getN())) {
    		LoadImage.fullSunFlower.update();
    		time1 = System.currentTimeMillis();
    	}
        produce();
		remove();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(LoadImage.fullSunFlower.getCurrentImage(), x, y,width, height, null);
		
	}
	
	public void produce() {
		 if (System.currentTimeMillis() - time2 > 1000/produceSpeed) {
	            new Sun(x,y);
	            time2 = System.currentTimeMillis();
	        }
	}
}
