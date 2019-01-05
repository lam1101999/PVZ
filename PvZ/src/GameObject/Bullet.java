package GameObject;

import java.awt.Graphics;

public abstract class Bullet extends GameObject {

	protected int damage;
	protected int flySpeed;	
	
	public Bullet(){
	        Handler.ListBullet.add(this);
	   }

}
