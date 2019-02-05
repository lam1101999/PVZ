package Load;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import GameObject.GameObject;
import GameObject.Handler;
import GameObject.Flower.FrostPeaShooter;
import GameObject.Flower.PeaShooter;
import GameObject.Flower.Plant;
import GameObject.Flower.SunFlower;
import GameObject.Flower.WalNut;


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
		if ((e.getX() > 190) && (e.getX() < 270) && (e.getY() > 10) &&(e.getY() < 110) )  {
			n = 1;
			}
		// FrostPeaShooter
		else if ((e.getX() > 280) && (e.getX() < 360) && (e.getY() > 10) &&(e.getY() < 110) )  {
			n = 2;
		}
		else if ((e.getX() > 370) && (e.getX() < 450) && (e.getY() > 10) &&(e.getY() < 110) )  {
			n = 3;
		}
		else if ((e.getX() > 460) && (e.getX() < 540) && (e.getY() > 10) &&(e.getY() < 110) )  {
			n = 4;
		}
		else if ((e.getX() > 797) && (e.getX() < 911) && (e.getY() > 0) &&(e.getY() < 96) )  {
			n = 10;
		}
		else n= 0;
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Space sup;
		sup = checkPosition(x,y);
		if ((sup != null) && (n!=0)) {
			if ((!sup.isStatus()) && (n==1) && (Score.score >= PeaShooter.priceOfPeaShooter)) {
				 new PeaShooter(sup.getDrawX(),sup.getDrawY());
				 Score.score -= PeaShooter.priceOfPeaShooter;
				 sup.setStatus(true);
				 n = 0;
			}
			if ((!sup.isStatus()) && (n==2) && (Score.score >= FrostPeaShooter.priceOfFrostPeaShooter)) {
				 new FrostPeaShooter(sup.getDrawX(),sup.getDrawY());
				 Score.score -= FrostPeaShooter.priceOfFrostPeaShooter;
				 sup.setStatus(true);
				 n = 0;
			}
			if ((!sup.isStatus()) && (n==3) && (Score.score >= SunFlower.priceOfSunFlower)) {
				 new SunFlower(sup.getDrawX(),sup.getDrawY());
				 Score.score -= SunFlower.priceOfSunFlower;
				 sup.setStatus(true);
				 n = 0;
			}	
			if ((!sup.isStatus()) && (n==4) && (Score.score >= WalNut.priceOfWalNut)) {
				 new WalNut(sup.getDrawX(),sup.getDrawY());
				 Score.score -= WalNut.priceOfWalNut;
				 sup.setStatus(true);
				 n = 0;
			}	
			if	(n==10) {
			if (sup.isStatus()) {
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
		
			}else n = 0;	
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
