package GameObject;

import java.awt.Graphics;

import Load.LoadImage;
import MainFrame.PvZGame;

public class LawnMower extends GameObject {
	private final static int speedOfLawnMower= 5;
	private int speed;
	private long time1 = System.currentTimeMillis();

	public LawnMower(int x, int y) {
		this.x = x;
		this.y = y;
		speed = 0;
		width = 100;
		height = 100;
		Handler.ListLawnMower.add(this);
	}
	@Override
	public void tick() {
		if(System.currentTimeMillis() - time1 > (1000/60)) {
			time1 = System.currentTimeMillis();
			x = x + speed;
		}
    	checkCollision();
        remove();
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(LoadImage.lawnMower,x,y,width,height,null);		
	}

	@Override
	public void remove() {
		if( x > PvZGame.WIDTH)
			Handler.ListLawnMower.remove(this);
		
	}
	
    public void checkCollision() {
    	for(int i = 0; i< Handler.ListZombie.size(); i++) {
    		if(this.getBound().intersects( Handler.ListZombie.get(i).getBound())) {
    			this.speed = speedOfLawnMower;
    			Handler.ListZombie.get(i).setHealth(0);
    			
    		}
    	}
    	
    }

}
