package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    //SCREEN SETTINGS
    final int originalTileSize= 32; //32*32??
    final int scale = 2;


    final int tileSize= originalTileSize*scale; //Tile size will be 96*96

    final int maxScreenCol= 16;
    final int maxScreenRow=12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize*maxScreenRow;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}
