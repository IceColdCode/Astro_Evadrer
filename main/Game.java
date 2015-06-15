package main;

import javax.swing.JFrame;
import javax.imageio.ImageIO;

import java.awt.*;

import java.io.*;

public class Game {
  
  ImageIcon icon;
  
  public static void main(String[] args) {
    
    // load resources
    icon = new ImageIcon("../icons/icon.gif");
    
    // init the window
    JFrame window = new JFrame("Astro Evader");
    
    // set the icon image
    window.setIconImage(icon.getImage());
    
    // set default stuff
    window.setContentPane(new GamePanel());
    window.pack();
    window.setVisible(true);
    
  }
  
}
