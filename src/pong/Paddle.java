/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.MouseInfo;
import javax.swing.JFrame;

/**
 *
 * @author Nathan
 */
public class Paddle {
    public int xPos;
    public int yPos;
    public int width;
    public int height;
    
    public Paddle(int xP, int yP, int w, int h){
        xPos = xP;
        yPos = yP;
        width = w;
        height = h;
    }
    
    public void Move(JFrame gameFrame, int screenHeight){
        int y = MouseInfo.getPointerInfo().getLocation().y - gameFrame.getLocationOnScreen().y - 35;
        //int y = MouseInfo.getPointerInfo().getLocation().y;
        if(y<=0)
            yPos=0;
        else if(y>=(screenHeight - height - 35))
            yPos = screenHeight - height - 32;
        else
            yPos = y;
        //yPos = ((y <= 0) ?0:y);
        //yPos = ((y >= screenHeight-height) ?screenHeight-height:y);
    }
}
