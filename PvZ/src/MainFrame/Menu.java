package MainFrame;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.GameObject;
import GameObject.Handler;
import Load.LoadImage;

public class Menu extends MouseAdapter {

	PvZGame game;

	public Menu(PvZGame game) {
		this.game = game;
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if (game.gameState == PvZGame.STATE.Menu) {
			if (mouseOver(mx, my, 800, 170, 600, 110)) {
				game.gameState = PvZGame.STATE.Game;
			}
		}
//		if (game.gameState == PvZGame.STATE.Game) {
//			checkGameEnd();
//
//		}
		if (game.gameState == PvZGame.STATE.End) {
			if (mouseOver(mx, my, 560, 580, 400, 60)) {
				game.gameState = PvZGame.STATE.Menu;
			}
		}
	}

//	public void checkGameEnd() {
//		for (int i = 0; i < Handler.ListZombie.size(); i++) {
//			GameObject tempObject = Handler.ListZombie.get(i);
//			if (tempObject.getX() <= 20) {
//				game.gameState = PvZGame.STATE.End;
//			}
//		}
//	}

	public void tick() {

	}

	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx > x && mx < x + width) {
			if (my > y && my < y + height) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public void render(Graphics g) {
		if (game.gameState == PvZGame.STATE.Menu) {
			g.drawImage(LoadImage.MenuState, 0, 0, PvZGame.WIDTH, PvZGame.HEIGHT - 50, null);
		}
		if (game.gameState == PvZGame.STATE.End) {
			g.drawImage(LoadImage.EndGame, 0, 0, PvZGame.WIDTH, PvZGame.HEIGHT - 50, null);
			g.drawRect(560, 580, 400, 60);
		}
	}

}
