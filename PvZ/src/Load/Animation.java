package Load;

import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Animation {

    public Image[] images;
    private int n;
    private int currentImage;

    public int getN() {
    	return n;
    }
    
    public Animation() {
        n = 0;
        currentImage=0;
    }
     public void addImage(Image image){
         Image [] ar = images;
         images = new Image[n+1];
         
         for (int i = 0; i <n; i++) images[i]=ar[i];
             images[n]= image;
             n++;
         
    }
     
    public Image getCurrentImage(){
        return images[currentImage];
    }
    
    public void update(){
        currentImage++;
        if (currentImage>=n) currentImage =0;
    }
    
}
