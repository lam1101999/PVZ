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
    }
}
