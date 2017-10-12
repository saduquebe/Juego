/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener{
    private Timer timer;
    public Board() {

        this.timer= new Timer(25,this);
 
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image fondo=loadImage("fondo.png");
        g.drawImage(fondo,0,0,this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
       public Image loadImage(String imageName) {
       ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
         return image;
    }

}
