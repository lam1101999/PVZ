package Load;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import GameObject.FrostPeaShooter;
import GameObject.GameObject;
import GameObject.Handler;
import GameObject.PeaShooter;
import GameObject.Plant;
import GameObject.SunFlower;


public class PlantTree implements MouseListener {
	public static int n=0;
	
	public  PlantTree() {
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// PeaShooter
		if ((e.getX() > 190) && (e.getX() < 254) && (e.getY() > 10) &&(e.getY() < 99) )  {
			n = 1;
			}
		// FrostPeaShooter
		if ((e.getX() > 260) && (e.getX() < 324) && (e.getY() > 10) &&(e.getY() < 99) )  {
			n = 2;
		}
		if ((e.getX() > 330) && (e.getX() < 394) && (e.getY() > 10) &&(e.getY() < 99) )  {
			n = 3;
		}
		if ((e.getX() > 797) && (e.getX() < 911) && (e.getY() > 0) &&(e.getY() < 96) )  {
			n = 10;
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Space sup;
		sup = checkPosition(x,y);
		if ((sup != null) && (n!=0)) {
			if ((!sup.isStatus()) && (n==1) && (Score.score >= 100)) {
				 new PeaShooter(sup.getDrawX(),sup.getDrawY());
				 Score.score -= PeaShooter.priceOfPeaShooter;
				 sup.setStatus(true);
				 n = 0;
			}
			if ((!sup.isStatus()) && (n==2) && (Score.score >= 170)) {
				 new FrostPeaShooter(sup.getDrawX(),sup.getDrawY());
				 Score.score -= FrostPeaShooter.priceOfFrostPeaShooter;
				 sup.setStatus(true);
				 n = 0;
			}
			if ((!sup.isStatus()) && (n==3) && (Score.score >= 50)) {
				 new SunFlower(sup.getDrawX(),sup.getDrawY());
				 Score.score -= SunFlower.priceOfSunFlower;
				 sup.setStatus(true);
				 n = 0;
			}	
			if ((sup.isStatus()) && (n==10)) {
				Iterator<Plant> itrgo = Handler.ListPlant.iterator();	
				while(itrgo.hasNext()) {
					GameObject gameobject = itrgo.next();
					if((gameobject instanceof Plant) && (gameobject.getX()==sup.drawX) && (gameobject.getY()==sup.drawY)) {
						itrgo.remove();
						sup.setStatus(false);
						 n = 0;
					}
				}
				 
			}
		
		}	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Space checkPosition(int x, int y) {
		
		Space[][] sup1 = new Space[5][9];	
		sup1 = LoadSpace.space;
		
		Space sup2=null;
		
		for (int i = 0;i < 5; i++)
			for (int j = 0; j < 9; j++) {
				if ((x>sup1[i][j].getMinX() && (x<sup1[i][j].getMaxX()) && (y>sup1[i][j].getMinY()) && (y<sup1[i][j].getMaxY())))
						sup2 = sup1[i][j];
			}
		
		
		return sup2;
	}
	
	

}
