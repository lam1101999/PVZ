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

import Load.*;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Admin
 */
public abstract class GameObject {

    // Tá»�a Ä‘á»™ cá»§a tá»«ng object khi hiá»ƒn thá»‹ lÃªn Panel
    protected int x;
    protected int y;
    protected int width;
	protected int height;
	
	
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract void remove();
    
    public Rectangle getBound() {
    	return new Rectangle(x,y,width,height);
    }

    
}

