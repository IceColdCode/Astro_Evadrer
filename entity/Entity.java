package entity;

import java.awt.*;

import image.*;

public abstract class Entity {
  
  // number of actions and frames
  public int width[numberOfActions];
  public int numberOfActions = 1;
  private int currentIndex = 0;
  public int[numberOfActions] [width.length] actionFrames;
  
  public int x, y, dx, dy;
  
  // sprite actions
  private Animation[] actions = new Animation("../spritesheets/alien.gif");
  
  private Thread t;
  
  public void init() {
    
    for(int i = 0; i < actionFrames.length; i++){
      for(int j = 0;j < actionFrames[].length; j++) {
        actions[j].load(i * width[i], j * height, actions[i]);
      }
    }
    
  }
  
  public void start() {
    
    // game loop
    
    t = new Thread(new Runnable() {
      public void run() {
        
        while(true) {
          for (int i = 0; i < actions[i].numberOfFrames; i++) {
            g.drawImage(actions[i].frames[i], x, y, null);
            x += dx;
            y += dy;
            this.sleep(100);
          }
        }
      }
      t.start();
    
    }
    
  }
  
  
  
}
