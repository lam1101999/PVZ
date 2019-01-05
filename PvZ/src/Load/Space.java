package Load;

public class Space {
	public int maxX;
	public int minX;
	public int maxY;
	public int minY;
	public int drawX;
	public int drawY;
	public boolean status = false;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Space(int x,int y) {
		drawX = x;
		drawY = y;
	}
	public Space(int drawX,int drawY,int minX,int maxX,int minY, int maxY) {
		this.drawX = drawX;
		this.drawY = drawY;
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}
	public int getMaxX() {
		return maxX;
	}
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	public int getMinX() {
		return minX;
	}
	public void setMinX(int minX) {
		this.minX = minX;
	}
	public int getMaxY() {
		return maxY;
	}
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	public int getMinY() {
		return minY;
	}
	public void setMinY(int minY) {
		this.minY = minY;
	}
	public int getDrawX() {
		return drawX;
	}
	public void setDrawX(int drawX) {
		this.drawX = drawX;
	}
	public int getDrawY() {
		return drawY;
	}
	public void setDrawY(int drawY) {
		this.drawY = drawY;
	}
	public String toString() {
		return "  "+minY+"\n"+minX+"    "+maxX+"\n"+"  "+maxY+"\n";
	}
	
}
