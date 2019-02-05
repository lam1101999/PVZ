package GameObject.Bullet;

import java.awt.Graphics;

import GameObject.GameObject;
import GameObject.Handler;

public abstract class Bullet extends GameObject {

	protected int damage;
	protected int flySpeed;	
	
	public Bullet(){
	        Handler.ListBullet.add(this);
	   }

}
