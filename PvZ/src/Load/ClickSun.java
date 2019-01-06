package Load;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import GameObject.GameObject;
import GameObject.Handler;
import GameObject.Plant;
import GameObject.Sun;

public class ClickSun implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Iterator<Sun> itrgo = Handler.ListSun.iterator();	
		while(itrgo.hasNext()) {
			GameObject gameobject = itrgo.next();
			if((x>=gameobject.getX()) && (x<=(gameobject.getX()+gameobject.getWidth())) && (y>=gameobject.getY()) && (y<=(gameobject.getY()+gameobject.getHeight()))) {
				Score.score += 25;
				itrgo.remove();
				
			}
		
		}
}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Iterator<Sun> itrgo = Handler.ListSun.iterator();	
		while(itrgo.hasNext()) {
			GameObject gameobject = itrgo.next();
			if((x>=gameobject.getX()) && (x<=(gameobject.getX()+gameobject.getWidth())) && (y>=gameobject.getY()) && (y<=(gameobject.getY()+gameobject.getHeight()))) {
				Score.score += 25;
				itrgo.remove();
				
			}
		
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
