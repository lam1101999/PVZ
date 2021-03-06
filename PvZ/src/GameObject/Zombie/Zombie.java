/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject.Zombie;

import java.awt.Graphics;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Handler;

/**
 *
 * @author Admin
 */
public abstract class Zombie extends GameObject {

    protected int health;
    protected int speed;
    protected int damage;
    protected int frequency;
    protected int attackspeed;
	protected boolean isAttackByFrostBullet = false;
    protected int freezeDuration;
    
    
    public boolean isAttackByFrostBullet() {
		return isAttackByFrostBullet;
	}

	public void setAttackByFrostBullet(boolean isAttackByFrostBullet) {
		this.isAttackByFrostBullet = isAttackByFrostBullet;
	}

	public int getFreezeDuration() {
		return freezeDuration;
	}

	public void setFreezeDuration(int freezeDuration) {
		this.freezeDuration = freezeDuration;
	}



    public Zombie() {
    	Handler.ListZombie.add(this);
        x = 1450;
        y = randomY();
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    

    public int randomY() {
        int Y[] = {150, 310, 470, 630, 790};
        Random r = new Random();
        return Y[r.nextInt(5)];
    }

    @Override
    public void remove() {
        if ( (health <= 0))
        Handler.ListZombie.remove(this);
    }
}
