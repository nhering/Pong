/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.MouseInfo;

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
    
    public void Move(int screenHeight){
        int y = MouseInfo.getPointerInfo().getLocation().y;
        if(y<=0)
            yPos=0;
        else if(y>=(screenHeight))
            yPos = screenHeight;
        else
            yPos = y;
        //yPos = ((y <= 0) ?0:y);
        //yPos = ((y >= screenHeight-height) ?screenHeight-height:y);
    }
}
