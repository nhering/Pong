/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;
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

    float x = 580f;
    float y = 380f;
    float border = 20f;
    float xSpeed = 2.5f;
    float ySpeed = 2.5f;
    
    public void moveBall(){
        if(x>=getWidth()-border || x<=0){
            xSpeed = xSpeed * -1;
        }
        x = x + xSpeed;
        
        if(y>=getHeight()-border || y<=0){
            ySpeed = ySpeed * -1;
        }
        y = y + ySpeed;
    }
    
    public void movePadle(){
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.white);
        g.fillOval((int) x, (int) y, 20, 20);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        // Make a window for the game
        JFrame gameFrame = new JFrame("Pong");
        gameFrame.setSize(1200, 800);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Logic for the game
        Pong pong = new Pong();
        gameFrame.add(pong);
        pong.setBackground(Color.black);
        
        while (true){
            pong.moveBall();
            pong.repaint();
            Thread.sleep(10);
        }
    }
    
}
