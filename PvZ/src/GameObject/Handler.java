/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

/**
 *
 * @author Admin
 */

import java.awt.Graphics;
import java.util.ArrayList;

import GameObject.Bullet.Bullet;
import GameObject.Bullet.Sun;
import GameObject.Flower.Plant;
import GameObject.Zombie.Zombie;

/**
 *
 * @author Admin
 */
public class Handler {

    public static ArrayList<LawnMower> ListLawnMower = new ArrayList<LawnMower>();
    public static ArrayList<Plant> ListPlant = new ArrayList<Plant>();
    public static ArrayList<Zombie> ListZombie = new ArrayList<Zombie>();
    public static ArrayList<Bullet> ListBullet = new ArrayList<Bullet>();
    public static ArrayList<Sun> ListSun = new ArrayList<Sun>();
    
    public static LawnMower lm1;
    public static LawnMower lm2;
    public static LawnMower lm3;
    public static LawnMower lm4;
    public static LawnMower lm5;
    
    public static void tick() {
        for (int i = 0; i < ListPlant.size(); i++) {
            GameObject tempObject = ListPlant.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < ListZombie.size(); i++) {
            GameObject tempObject = ListZombie.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < ListBullet.size(); i++) {
            GameObject tempObject = ListBullet.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < ListSun.size(); i++) {
            GameObject tempObject = ListSun.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < ListLawnMower.size(); i++) {
            GameObject tempObject = ListLawnMower.get(i);
            
            tempObject.tick();
        }
    }
    
    public static void render(Graphics g){
    	 for (int i = 0; i < ListPlant.size(); i++) {
             GameObject tempObject = ListPlant.get(i);
             
             tempObject.render(g);
         }
         for (int i = 0; i < ListZombie.size(); i++) {
             GameObject tempObject = ListZombie.get(i);
             
             tempObject.render(g);
         }
         for (int i = 0; i < ListBullet.size(); i++) {
             GameObject tempObject = ListBullet.get(i);
             
             tempObject.render(g);
         }
         for (int i = 0; i < ListSun.size(); i++) {
             GameObject tempObject = ListSun.get(i);
             
             tempObject.render(g);
         }
         for (int i = 0; i < ListLawnMower.size(); i++) {
             GameObject tempObject = ListLawnMower.get(i);
             
             tempObject.render(g);
         }
    }
    
    public static void reset() {
    	ListPlant.clear();
    	ListZombie.clear();
    	ListBullet.clear();
    	ListSun.clear();
    	ListLawnMower.clear();
    	createLawnMower();
    }
    public static void createLawnMower() {
		lm1 = new LawnMower(0, 170);
		lm2 = new LawnMower(0, 330);
		lm3 = new LawnMower(0, 490);
		lm4 = new LawnMower(0, 650);
		lm5 = new LawnMower(0, 810);

	}
}
