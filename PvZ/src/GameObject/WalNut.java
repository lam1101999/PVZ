package GameObject;

import java.awt.Graphics;

import Load.LoadImage;

public class WalNut extends Plant {
	public final static int healthOfWalNut = 500;
	public  static int priceOfWalNut = 100;
	
	
	
	long time1 = System.currentTimeMillis();
	long time2 = System.currentTimeMillis();
	
    
    

    
    public WalNut(int x, int y) {
      this.x = x;
      this.y = y;
      health = healthOfWalNut;
      width = 100;
      height = 100;
    }

    @Override
    public void tick() {
    	if(System.currentTimeMillis() - time1> 500) {
    		time1 = System.currentTimeMillis();
    		if(health >150)
    			LoadImage.fullWalNut1.update();
    		else LoadImage.fullWalNut2.update();
    	}
        remove();
    }

    @Override
    public void render(Graphics g) {
    	if(health > 150)
    	  g.drawImage(LoadImage.fullWalNut1.getCurrentImage(), x, y, width, height, null);
    	else g.drawImage(LoadImage.fullWalNut2.getCurrentImage(), x, y, width, height, null);
    }

}
