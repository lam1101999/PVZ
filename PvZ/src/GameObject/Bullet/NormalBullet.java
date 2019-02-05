/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject.Bullet;

import Load.LoadImage;
import MainFrame.PvZGame;
import java.awt.Graphics;

import GameObject.Handler;

/**
 *
 * @author Admin
 */
public class NormalBullet extends Bullet {

	private final static int flySpeedOfNormalBullet= 5;
	private long time1 = System.currentTimeMillis();
	

    public NormalBullet(int x, int y, int damage) {
        this.x = x + 80;
        this.y = y;
        this.damage = damage;
        flySpeed = flySpeedOfNormalBullet;
        width = 40;
        height = 40;
    }

    @Override
    public void tick() {
    	if(System.currentTimeMillis() - time1 > (1000/60)) {
			time1 = System.currentTimeMillis();
			x = x + flySpeed;
		}
    	checkCollision();
        remove();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(LoadImage.normalBullet, x, y,width,height,null);
    }

    @Override
    public void remove() {
        if (x>=PvZGame.WIDTH)
            Handler.ListBullet.remove(this);
    }
    public void checkCollision() {
    	for(int i = 0; i< Handler.ListZombie.size(); i++) {
    		if(this.getBound().intersects( Handler.ListZombie.get(i).getBound())) {
    			int	hp = Handler.ListZombie.get(i).getHealth() - this.damage;
    			Handler.ListBullet.remove(this);
    			Handler.ListZombie.get(i).setHealth(hp);
    			
    		}
    	}
    	
    }

}
