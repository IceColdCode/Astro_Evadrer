package image;

import java.awt.*;
import javax.imageio.ImageIO;

public class Animation {
  
  // frames
  public int size = 5;
  private BufferedImage[size] frames;
  private BufferedImage spriteSheet;
  
  // sprite sheet dimensions
  private int width;
  private int height;
  private int numFramesAcross;
  private int numColumns
  
  public Animation(int width, int height, int numTilesAcross, int numColumns) throws Exception {
    
    this.width = width;
    this.height = height;
    this.numTilesAcross = numTilesAcross;
    this.numColumns = numColumns;
    
  }
  
  load(String spriteSheetPath) throws IOException {
    
    spriteSheet = ImageIO.read(getClass().gerResourceAsStream(spriteSheetPath));
    
    for(int i = 0; i < width; i++) {
      for(int j = 0; j< height; j++) {
        frames [(i * columns) + j] = spriteSheet.getSubimage(i * width, j * height, width, height);
      }
    }
    
  }
  
}
