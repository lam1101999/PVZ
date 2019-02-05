/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject.Flower;

import java.awt.Graphics;
import java.awt.Rectangle;

import GameObject.GameObject;
import GameObject.Handler;
import MainFrame.PvZGame;

/**
 *
 * @author Admin
 */
public abstract class Plant extends GameObject {

    protected int health;

    ;
    public Plant(){
        Handler.ListPlant.add(this);
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    @Override
    public void remove() {
        if (health <= 0) {
            Handler.ListPlant.remove(this);
        }
    }
    public Rectangle getBound2(){
    	return new Rectangle(x,y,width+PvZGame.WIDTH,height);
    }


}
