/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

import java.awt.Graphics;
import java.util.Random;

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
        if ((x<=0) || (health <= 0))
        Handler.ListZombie.remove(this);
    }
}
