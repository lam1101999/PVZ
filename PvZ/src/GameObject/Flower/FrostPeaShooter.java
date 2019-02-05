
package GameObject.Flower;

import java.awt.Graphics;

import GameObject.Handler;
import GameObject.Bullet.FrostBullet;
import Load.LoadImage;

/**
 *
 * @author Admin
 */
public class FrostPeaShooter extends Plant {
	public final static int healthOfFrostPeaShooter = 100;
	public static int priceOfFrostPeaShooter = 175;
	public final static int damageOfFrostPeaShooter = 40;
	public final static double shootSpeedOfFrostPeaShooter = 0.5;//number of bullet per second
	
	private double shootSpeed;
	private int damage;
	
	
	long time1 = System.currentTimeMillis();
	long time2 = System.currentTimeMillis();
	
    
    

    
    public FrostPeaShooter(int x, int y) {
      this.x = x;
      this.y = y;
      health = healthOfFrostPeaShooter;
      shootSpeed = shootSpeedOfFrostPeaShooter;
      damage = damageOfFrostPeaShooter;
      width = 100;
      height = 100;
    }

    @Override
    public void tick() {
    	if(System.currentTimeMillis() - time1>((1000/shootSpeed)/LoadImage.fullFrostPeaShooter.getN())) {
    		LoadImage.fullFrostPeaShooter.update();
    		time1 = System.currentTimeMillis();
    	}
       checkCollision();
        remove();
    }

    @Override
    public void render(Graphics g) {
    	  g.drawImage(LoadImage.fullFrostPeaShooter.getCurrentImage(), x, y, width, height, null);
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
            new FrostBullet(x, y, damage);
            time2 = System.currentTimeMillis();
        }
    }
}
