package Load;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadImagePeaShooter {
	
	public static BufferedImage sprite;
	 
	public static Image peaShooter1;
    public static Image peaShooter2;
    public static Image peaShooter3;
    public static Image peaShooter4;
    public static Image peaShooter5;
    public static Image peaShooter6;
    public static Image peaShooter7;
    
    public static Animation fullPeaShooter;
    
    public LoadImagePeaShooter(){
    	
			loadImage();
			loadAnimation();
 
    }
    public void loadImage() {
    	try {
			sprite = ImageIO.read(new File("sources/all/all.png"));
			peaShooter1 = sprite.getSubimage(1, 86, 80, 84);
	        peaShooter2 = sprite.getSubimage(84, 85, 77, 86);
	        peaShooter3 = sprite.getSubimage(165, 94, 80, 84);
	        peaShooter4 = sprite.getSubimage(249, 95, 80, 84);
	        peaShooter5 = sprite.getSubimage(330, 96, 80, 84);
	        peaShooter6 = sprite.getSubimage(414, 91, 85, 82);
	        peaShooter7 = sprite.getSubimage(506, 92, 85, 79);
		} catch (IOException e) {
			e.printStackTrace();
		}   	
    }
    
    public void loadAnimation() {
    	  fullPeaShooter = new Animation();
	        fullPeaShooter.addImage(peaShooter1);
	        fullPeaShooter.addImage(peaShooter2);
	        fullPeaShooter.addImage(peaShooter3);
	        fullPeaShooter.addImage(peaShooter4);
	        fullPeaShooter.addImage(peaShooter5);
	        fullPeaShooter.addImage(peaShooter6);
	        fullPeaShooter.addImage(peaShooter7);
    }
    
}
