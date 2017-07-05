/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author Nathan
 */
public class Ball {
    public float diameter;
    public float xPos;
    public float yPos;
    public float xSpeed;
    public float ySpeed;
    
    public Ball(float d, float xP, float yP, float xS, float yS){
        diameter=d;
        xPos=xP;
        yPos=yP;
        xSpeed=xS;
        ySpeed=yS;
    }
    
    public void Move(int width, int height){
        if(xPos>=(width-diameter) || xPos<=0){
            xSpeed = xSpeed * -1;
        }
        xPos = xPos + xSpeed;
        
        if(yPos>=(height-diameter) || yPos<=0){
            ySpeed = ySpeed * -1;
        }
        yPos = yPos + ySpeed;
    }
}
