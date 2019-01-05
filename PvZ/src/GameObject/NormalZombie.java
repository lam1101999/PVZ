/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

import Load.LoadImage;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class NormalZombie extends Zombie {
	public final static int attackSpeedOfNormalZombie = 2000;
	public final static int speedOfNormalZombie = 5;
    private static long time = System.currentTimeMillis();
    
    private long time1 = System.currentTimeMillis();

    public NormalZombie() {
        health = 100;
        speed = speedOfNormalZombie;                                       // 1 = Slowest 
        damage = 50;
        frequency = 5;
        width = 120;
        height =150;
        attackspeed = attackSpeedOfNormalZombie;
    }

    @Override
    public void tick() {
        x -= speed;
        LoadImage.fullNormalZombie.update();
        createNormalZombie();
        checkCollision();
        remove();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(LoadImage.fullNormalZombie.getCurrentImage(), x, y - 20, width, height, null);
    }

    public void createNormalZombie() {
        if (System.currentTimeMillis() - time > frequency * 100) {
            new NormalZombie();
            time = System.currentTimeMillis();
        }
    }
    public void checkCollision() {
    	for(int i = 0; i< Handler.ListPlant.size(); i++)
    			if(this.getBound().intersects( Handler.ListPlant.get(i).getBound())) {
    				speed = 0;
    				attack(Handler.ListPlant.get(i));
    			} else speed = speedOfNormalZombie;
    	if (Handler.ListPlant.size() == 0)
    		speed = speedOfNormalZombie;
    	
    }
    
    public void attack(Plant sup) {
    	
    	if (System.currentTimeMillis() - time1 >= attackspeed) {
    		int	hp = sup.getHealth() - this.damage;
			sup.setHealth(hp);
			time1 = System.currentTimeMillis();
    	}
    }
}
