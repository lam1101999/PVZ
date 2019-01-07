/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Load;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class LoadImage {

    public static BufferedImage sprite;

    public static Image normalZombie1;
    public static Image normalZombie2;
    public static Image normalZombie3;
    public static Image normalZombie4;
    public static Image normalZombie5;
    public static Image normalZombie6;
    public static Image normalZombie7;
    public static Image normalZombie8;
    public static Image normalZombie9;
    public static Image normalZombie10;
    public static Image normalZombie11;
    public static Image normalZombie12;
    public static Image normalZombie13;
    public static Image normalZombie14;

    public static Image Sun;
    public static Image normalBullet;
    public static Image frostBullet;
    public static Image lawnMower;
    
    public static Image peaShooter1;
    public static Image peaShooter2;
    public static Image peaShooter3;
    public static Image peaShooter4;
    public static Image peaShooter5;
    public static Image peaShooter6;
    public static Image peaShooter7;
    
    public static Image frostPeaShooter1;
    public static Image frostPeaShooter2;
    public static Image frostPeaShooter3;
    public static Image frostPeaShooter4;
    public static Image frostPeaShooter5;
    
    public static Image walNut1;
    public static Image walNut2;
    public static Image walNut3;
    public static Image walNut4;
    

    
    public static Image sunFlower1;
    public static Image sunFlower2;
    public static Image sunFlower3;
    public static Image sunFlower4;
    public static Image sunFlower5;
    
    
    
    public static Image originPeaShooter;
    public static Image originFrostPeaShooter;
    public static Image originSunFlower;
    public static Image  originWalNut;
//--------------------------------------------------------------------------------------------------------------//
//    
//    //ANIMATION
    public static Animation fullPeaShooter;
    public static Animation fullNormalZombie;
    public static Animation fullFrostPeaShooter;
    public static Animation fullSunFlower;
    public static Animation fullWalNut1;
    public static Animation fullWalNut2;

    public static Image screenBackGound;
    public static Image MenuState;
    public static Image EndGame;
    
    public LoadImage(){
        loadImage();
        loadAmination();
    }

    public void loadImage() {
        try {
            screenBackGound = ImageIO.read(new File("sources/BackGroundPvZ.png"));
            MenuState = ImageIO.read(new File("sources/MenuState.png"));
            EndGame = ImageIO.read(new File("sources/endgame.png"));
            
            
            sprite = ImageIO.read(new File("sources/all/all.png"));
            normalZombie1 = ImageIO.read(new File("sources/NormalZombie/1.png"));
            normalZombie2 = ImageIO.read(new File("sources/NormalZombie/2.png"));
            normalZombie3 = ImageIO.read(new File("sources/NormalZombie/3.png"));
            normalZombie4 = ImageIO.read(new File("sources/NormalZombie/4.png"));
            normalZombie5 = ImageIO.read(new File("sources/NormalZombie/5.png"));
            normalZombie6 = ImageIO.read(new File("sources/NormalZombie/6.png"));
            normalZombie7 = ImageIO.read(new File("sources/NormalZombie/7.png"));
            normalZombie8 = ImageIO.read(new File("sources/NormalZombie/8.png"));
            normalZombie9 = ImageIO.read(new File("sources/NormalZombie/9.png"));
            normalZombie10 = ImageIO.read(new File("sources/NormalZombie/10.png"));
            normalZombie11= ImageIO.read(new File("sources/NormalZombie/11.png"));
            normalZombie12= ImageIO.read(new File("sources/NormalZombie/12.png"));
            normalZombie13= ImageIO.read(new File("sources/NormalZombie/13.png"));
            normalZombie14= ImageIO.read(new File("sources/NormalZombie/14.png"));

           
            
//            normalBullet = ImageIO.read(new File("sources/NormalBullet.png"));

            peaShooter1 = sprite.getSubimage(1, 86, 80, 84);
            peaShooter2 = sprite.getSubimage(84, 85, 77, 86);
            peaShooter3 = sprite.getSubimage(165, 94, 80, 84);
            peaShooter4 = sprite.getSubimage(249, 95, 80, 84);
            peaShooter5 = sprite.getSubimage(330, 96, 80, 84);
            peaShooter6 = sprite.getSubimage(414, 91, 85, 82);
            peaShooter7 = sprite.getSubimage(506, 92, 85, 79);
            
            frostPeaShooter1 = sprite.getSubimage(493, 179, 85, 99);
            frostPeaShooter2 = sprite.getSubimage(583, 182, 85, 95);
            frostPeaShooter3 = sprite.getSubimage(674, 182, 85, 99);
            frostPeaShooter4 = sprite.getSubimage(764, 184, 96, 99);
            frostPeaShooter5 = sprite.getSubimage(868, 185, 96, 99);
            
            sunFlower1 = sprite.getSubimage(0, 0, 83, 84);
            sunFlower2 = sprite.getSubimage(83, 0, 83, 84);
            sunFlower3 = sprite.getSubimage(165, 0, 83, 84);
            sunFlower4 = sprite.getSubimage(245, 0, 83, 84);
            sunFlower5 = sprite.getSubimage(325, 0, 83, 84);
            
            walNut1 = sprite.getSubimage(12, 285, 79, 91);
            walNut2 = sprite.getSubimage(107, 285, 79, 91);
            walNut3 = sprite.getSubimage(967, 299, 79, 91);
            walNut4 = sprite.getSubimage(1059, 299, 79, 91);
           
            
            frostBullet = sprite.getSubimage(990, 199, 32, 32);
            normalBullet = sprite.getSubimage(605, 93, 34, 33);
            Sun = ImageIO.read(new File("sources/Sun.png"));
            lawnMower = sprite.getSubimage(293, 198, 60, 75);
//            
            originPeaShooter = sprite.getSubimage(612, 617, 64, 89);
            originFrostPeaShooter = sprite.getSubimage(836, 618, 64, 89);
            originSunFlower = sprite.getSubimage(688,618, 64, 89);
            originWalNut = sprite.getSubimage(1004, 622, 64, 89);
//            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    

    public void loadAmination() {
        fullNormalZombie = new Animation();
//        
        fullNormalZombie.addImage(normalZombie1);
        fullNormalZombie.addImage(normalZombie2);
        fullNormalZombie.addImage(normalZombie3);
        fullNormalZombie.addImage(normalZombie4);
        fullNormalZombie.addImage(normalZombie5);
        fullNormalZombie.addImage(normalZombie6);
        fullNormalZombie.addImage(normalZombie7);
        fullNormalZombie.addImage(normalZombie8);
        fullNormalZombie.addImage(normalZombie9);
        fullNormalZombie.addImage(normalZombie10);
        fullNormalZombie.addImage(normalZombie11);
        fullNormalZombie.addImage(normalZombie12);
        fullNormalZombie.addImage(normalZombie13);
        fullNormalZombie.addImage(normalZombie14);
//        
//        
        fullPeaShooter = new Animation();
        fullPeaShooter.addImage(peaShooter1);
        fullPeaShooter.addImage(peaShooter2);
        fullPeaShooter.addImage(peaShooter3);
        fullPeaShooter.addImage(peaShooter4);
        fullPeaShooter.addImage(peaShooter5);
        fullPeaShooter.addImage(peaShooter6);
        fullPeaShooter.addImage(peaShooter7);
        
        fullFrostPeaShooter = new Animation();
        fullFrostPeaShooter.addImage(frostPeaShooter1);
        fullFrostPeaShooter.addImage(frostPeaShooter2);
        fullFrostPeaShooter.addImage(frostPeaShooter3);
        fullFrostPeaShooter.addImage(frostPeaShooter4);
        fullFrostPeaShooter.addImage(frostPeaShooter5);
        
        fullSunFlower = new Animation();
        fullSunFlower.addImage(sunFlower1);
        fullSunFlower.addImage(sunFlower2);
        fullSunFlower.addImage(sunFlower3);
        fullSunFlower.addImage(sunFlower4);        
        fullSunFlower.addImage(sunFlower5);
        
        fullWalNut1 = new Animation();
        fullWalNut1.addImage(walNut1);
        fullWalNut1.addImage(walNut2);
        fullWalNut2 = new Animation();
        fullWalNut2.addImage(walNut3);
        fullWalNut2.addImage(walNut4);
        
    }
}
