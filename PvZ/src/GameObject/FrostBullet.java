package GameObject;

import java.awt.Graphics;

import Load.LoadImage;
import MainFrame.PvZGame;

public class FrostBullet extends Bullet {
	private final static int flySpeedOfNormalBullet= 5;
	private long time1 = System.currentTimeMillis();
	

    public FrostBullet(int x, int y, int damage) {
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
        g.drawImage(LoadImage.frostBullet, x, y, width, height, null);
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
    			Handler.ListZombie.get(i).setAttackByFrostBullet(true);
    			
    		}
    	}
    	
    }

}


