
package Schack;

import java.awt.*;

public class Cel {
    
    private int width; 
    private int xpos, ypos; 
    private Color bg; 
   
    public Cel(int x, Color c) {
        width = x; 
        bg = c; 
    }
    public void setPosition(int x, int y) {
        xpos = x; 
        ypos = y; 
    }
    public void ritaCel(Graphics g) {
        g.setColor(bg);
        g.fillRect(xpos, ypos, width, width);
    }
}
