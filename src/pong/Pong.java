/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nathan
 */
public class Pong extends JPanel{

    Ball ball = new Ball(20,580,380,2.5f,2.5f);
    Paddle leftPlayer = new Paddle(40,400,30,90);
    Paddle rightPlayer = new Paddle(1130,400,30,90);
     
    public void movePadle(){
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.white);
        g.fillOval((int) ball.xPos, (int) ball.yPos, (int)ball.diameter, (int)ball.diameter);
        g.fillRect(leftPlayer.xPos, leftPlayer.yPos, leftPlayer.width, leftPlayer.height);
        g.fillRect(rightPlayer.xPos, rightPlayer.yPos, rightPlayer.width, rightPlayer.height);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        BufferedImage cursorImage =  new BufferedImage(16,16,BufferedImage.TYPE_INT_ARGB);
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0,0), "blank cursor");
        
        // Make a window for the game
        int sceneWidth = 1200;
        int sceneHeight = 800;
        JFrame gameFrame = new JFrame("Pong");
        gameFrame.setSize(sceneWidth, sceneHeight);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.getContentPane().setCursor(blankCursor);
        
        // Logic for the game
        Pong pong = new Pong();
        gameFrame.add(pong);
        pong.setBackground(Color.black);
        
        while (true){
            pong.ball.Move(sceneWidth,sceneHeight);
            pong.leftPlayer.Move(gameFrame,sceneHeight);
            pong.rightPlayer.Move(gameFrame, sceneHeight);
            pong.repaint();
            Thread.sleep(10);
        }
    }
    
}
