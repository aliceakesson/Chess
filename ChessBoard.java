
package Schack;

import java.awt.*;

public class ChessBoard {

    public static int x, y, width; 
    public final Color dark = new Color(210, 128, 45);
    public final Color light = new Color(255, 255, 204);
    
    ChessBoard(int marginx, int marginy, int celwidth) {
        x = marginx; 
        y = marginy; 
        width = celwidth; 
    }
    public ChessBoard() {
        
    }
    public void ritaChessBoard(Graphics g) {
        
        
        for(int i = 0; i < 8; i++) {
                        
            if(i == 0 || i == 2 || i == 4 || i == 6) { //startfärg för varje rad 
                    g.setColor(dark);
            }
            else {
                g.setColor(light);
            }
            
            for(int j = 0; j < 8; j++) {
                if(g.getColor() == dark) { //byta färg för varje ruta 
                    g.setColor(light);
                }
                else 
                    g.setColor(dark);
                
                g.fillRect(x + width*j, y + width*i, width, width);
            }
        }
        
    }
}

/*


package Schack;

import java.awt.*;

public class ChessBoard {
    
    protected int BoardWidth, celWidth, xpos, ypos; 
    
    protected SchackCel a1, a2, a3, a4, a5, a6, a7, a8; 
    protected SchackCel b1, b2, b3, b4, b5, b6, b7, b8; 
    protected SchackCel c1, c2, c3, c4, c5, c6, c7, c8; 
    protected SchackCel d1, d2, d3, d4, d5, d6, d7, d8; 
    protected SchackCel e1, e2, e3, e4, e5, e6, e7, e8; 
    protected SchackCel f1, f2, f3, f4, f5, f6, f7, f8; 
    protected SchackCel g1, g2, g3, g4, g5, g6, g7, g8; 
    protected SchackCel h1, h2, h3, h4, h5, h6, h7, h8; 
    
    public Color dark, light; 
    
    public ChessBoard(int x, int y, int width) {
        BoardWidth = width; 
        celWidth = (int) BoardWidth/8; 
        
        xpos = x;
        ypos = y; 
    }
    public ChessBoard() {
        
        
        
    }
    public void ritaChessBoard(Graphics g) {
        
        dark = new Color(210, 128, 45);
        light = new Color(255, 255, 204);
        
        a1 = new SchackCel(celWidth, light);
        a2 = new SchackCel(celWidth, dark);
        a3 = new SchackCel(celWidth, light);
        a4 = new SchackCel(celWidth, dark);
        a5 = new SchackCel(celWidth, light);
        a6 = new SchackCel(celWidth, dark);
        a7 = new SchackCel(celWidth, light);
        a8 = new SchackCel(celWidth, dark);
        
        b1 = new SchackCel(celWidth, dark);
        b2 = new SchackCel(celWidth, light);
        b3 = new SchackCel(celWidth, dark);
        b4 = new SchackCel(celWidth, light);
        b5 = new SchackCel(celWidth, dark);
        b6 = new SchackCel(celWidth, light);
        b7 = new SchackCel(celWidth, dark);
        b8 = new SchackCel(celWidth, light);

        c1 = new SchackCel(celWidth, light);
        c2 = new SchackCel(celWidth, dark);
        c3 = new SchackCel(celWidth, light);
        c4 = new SchackCel(celWidth, dark);
        c5 = new SchackCel(celWidth, light);
        c6 = new SchackCel(celWidth, dark);
        c7 = new SchackCel(celWidth, light);
        c8 = new SchackCel(celWidth, dark);
        
        d1 = new SchackCel(celWidth, dark);
        d2 = new SchackCel(celWidth, light);
        d3 = new SchackCel(celWidth, dark);
        d4 = new SchackCel(celWidth, light);
        d5 = new SchackCel(celWidth, dark);
        d6 = new SchackCel(celWidth, light);
        d7 = new SchackCel(celWidth, dark);
        d8 = new SchackCel(celWidth, light);

        e1 = new SchackCel(celWidth, light);
        e2 = new SchackCel(celWidth, dark);
        e3 = new SchackCel(celWidth, light);
        e4 = new SchackCel(celWidth, dark);
        e5 = new SchackCel(celWidth, light);
        e6 = new SchackCel(celWidth, dark);
        e7 = new SchackCel(celWidth, light);
        e8 = new SchackCel(celWidth, dark);
        
        f1 = new SchackCel(celWidth, dark);
        f2 = new SchackCel(celWidth, light);
        f3 = new SchackCel(celWidth, dark);
        f4 = new SchackCel(celWidth, light);
        f5 = new SchackCel(celWidth, dark);
        f6 = new SchackCel(celWidth, light);
        f7 = new SchackCel(celWidth, dark);
        f8 = new SchackCel(celWidth, light);

        g1 = new SchackCel(celWidth, light);
        g2 = new SchackCel(celWidth, dark);
        g3 = new SchackCel(celWidth, light);
        g4 = new SchackCel(celWidth, dark);
        g5 = new SchackCel(celWidth, light);
        g6 = new SchackCel(celWidth, dark);
        g7 = new SchackCel(celWidth, light);
        g8 = new SchackCel(celWidth, dark);
        
        h1 = new SchackCel(celWidth, dark);
        h2 = new SchackCel(celWidth, light);
        h3 = new SchackCel(celWidth, dark);
        h4 = new SchackCel(celWidth, light);
        h5 = new SchackCel(celWidth, dark);
        h6 = new SchackCel(celWidth, light);
        h7 = new SchackCel(celWidth, dark);
        h8 = new SchackCel(celWidth, light);
        
        a1.setPosition(celWidth*0 + xpos, ypos);
        a2.setPosition(celWidth*1 + xpos, ypos);
        a3.setPosition(celWidth*2 + xpos, ypos);
        a4.setPosition(celWidth*3 + xpos, ypos);
        a5.setPosition(celWidth*4 + xpos, ypos);
        a6.setPosition(celWidth*5 + xpos, ypos);
        a7.setPosition(celWidth*6 + xpos, ypos);
        a8.setPosition(celWidth*7 + xpos, ypos);
        
        b1.setPosition(celWidth*0 + xpos, celWidth + ypos);
        b2.setPosition(celWidth*1 + xpos, celWidth + ypos);
        b3.setPosition(celWidth*2 + xpos, celWidth + ypos);
        b4.setPosition(celWidth*3 + xpos, celWidth + ypos);
        b5.setPosition(celWidth*4 + xpos, celWidth + ypos);
        b6.setPosition(celWidth*5 + xpos, celWidth + ypos);
        b7.setPosition(celWidth*6 + xpos, celWidth + ypos);
        b8.setPosition(celWidth*7 + xpos, celWidth + ypos);
        
        c1.setPosition(celWidth*0 + xpos, celWidth*2 + ypos);
        c2.setPosition(celWidth*1 + xpos, celWidth*2 + ypos);
        c3.setPosition(celWidth*2 + xpos, celWidth*2 + ypos);
        c4.setPosition(celWidth*3 + xpos, celWidth*2 + ypos);
        c5.setPosition(celWidth*4 + xpos, celWidth*2 + ypos);
        c6.setPosition(celWidth*5 + xpos, celWidth*2 + ypos);
        c7.setPosition(celWidth*6 + xpos, celWidth*2 + ypos);
        c8.setPosition(celWidth*7 + xpos, celWidth*2 + ypos);
        
        d1.setPosition(celWidth*0 + xpos, celWidth*3 + ypos);
        d2.setPosition(celWidth*1 + xpos, celWidth*3 + ypos);
        d3.setPosition(celWidth*2 + xpos, celWidth*3 + ypos);
        d4.setPosition(celWidth*3 + xpos, celWidth*3 + ypos);
        d5.setPosition(celWidth*4 + xpos, celWidth*3 + ypos);
        d6.setPosition(celWidth*5 + xpos, celWidth*3 + ypos);
        d7.setPosition(celWidth*6 + xpos, celWidth*3 + ypos);
        d8.setPosition(celWidth*7 + xpos, celWidth*3 + ypos);
        
        e1.setPosition(celWidth*0 + xpos, celWidth*4 + ypos);
        e2.setPosition(celWidth*1 + xpos, celWidth*4 + ypos);
        e3.setPosition(celWidth*2 + xpos, celWidth*4 + ypos);
        e4.setPosition(celWidth*3 + xpos, celWidth*4 + ypos);
        e5.setPosition(celWidth*4 + xpos, celWidth*4 + ypos);
        e6.setPosition(celWidth*5 + xpos, celWidth*4 + ypos);
        e7.setPosition(celWidth*6 + xpos, celWidth*4 + ypos);
        e8.setPosition(celWidth*7 + xpos, celWidth*4 + ypos);
        
        f1.setPosition(celWidth*0 + xpos, celWidth*5 + ypos);
        f2.setPosition(celWidth*1 + xpos, celWidth*5 + ypos);
        f3.setPosition(celWidth*2 + xpos, celWidth*5 + ypos);
        f4.setPosition(celWidth*3 + xpos, celWidth*5 + ypos);
        f5.setPosition(celWidth*4 + xpos, celWidth*5 + ypos);
        f6.setPosition(celWidth*5 + xpos, celWidth*5 + ypos);
        f7.setPosition(celWidth*6 + xpos, celWidth*5 + ypos);
        f8.setPosition(celWidth*7 + xpos, celWidth*5 + ypos);
        
        g1.setPosition(celWidth*0 + xpos, celWidth*6 + ypos);
        g2.setPosition(celWidth*1 + xpos, celWidth*6 + ypos);
        g3.setPosition(celWidth*2 + xpos, celWidth*6 + ypos);
        g4.setPosition(celWidth*3 + xpos, celWidth*6 + ypos);
        g5.setPosition(celWidth*4 + xpos, celWidth*6 + ypos);
        g6.setPosition(celWidth*5 + xpos, celWidth*6 + ypos);
        g7.setPosition(celWidth*6 + xpos, celWidth*6 + ypos);
        g8.setPosition(celWidth*7 + xpos, celWidth*6 + ypos);
        
        h1.setPosition(celWidth*0 + xpos, celWidth*7 + ypos);
        h2.setPosition(celWidth*1 + xpos, celWidth*7 + ypos);
        h3.setPosition(celWidth*2 + xpos, celWidth*7 + ypos);
        h4.setPosition(celWidth*3 + xpos, celWidth*7 + ypos);
        h5.setPosition(celWidth*4 + xpos, celWidth*7 + ypos);
        h6.setPosition(celWidth*5 + xpos, celWidth*7 + ypos);
        h7.setPosition(celWidth*6 + xpos, celWidth*7 + ypos);
        h8.setPosition(celWidth*7 + xpos, celWidth*7 + ypos);
        
        a1.ritaCel(g);
        a2.ritaCel(g);
        a3.ritaCel(g);
        a4.ritaCel(g);
        a5.ritaCel(g);
        a6.ritaCel(g);
        a7.ritaCel(g);
        a8.ritaCel(g);
        
        b1.ritaCel(g);
        b2.ritaCel(g);
        b3.ritaCel(g);
        b4.ritaCel(g);
        b5.ritaCel(g);
        b6.ritaCel(g);
        b7.ritaCel(g);
        b8.ritaCel(g);
        
        c1.ritaCel(g);
        c2.ritaCel(g);
        c3.ritaCel(g);
        c4.ritaCel(g);
        c5.ritaCel(g);
        c6.ritaCel(g);
        c7.ritaCel(g);
        c8.ritaCel(g);
        
        d1.ritaCel(g);
        d2.ritaCel(g);
        d3.ritaCel(g);
        d4.ritaCel(g);
        d5.ritaCel(g);
        d6.ritaCel(g);
        d7.ritaCel(g);
        d8.ritaCel(g);
        
        e1.ritaCel(g);
        e2.ritaCel(g);
        e3.ritaCel(g);
        e4.ritaCel(g);
        e5.ritaCel(g);
        e6.ritaCel(g);
        e7.ritaCel(g);
        e8.ritaCel(g);
        
        f1.ritaCel(g);
        f2.ritaCel(g);
        f3.ritaCel(g);
        f4.ritaCel(g);
        f5.ritaCel(g);
        f6.ritaCel(g);
        f7.ritaCel(g);
        f8.ritaCel(g);
        
        g1.ritaCel(g);
        g2.ritaCel(g);
        g3.ritaCel(g);
        g4.ritaCel(g);
        g5.ritaCel(g);
        g6.ritaCel(g);
        g7.ritaCel(g);
        g8.ritaCel(g);
        
        h1.ritaCel(g);
        h2.ritaCel(g);
        h3.ritaCel(g);
        h4.ritaCel(g);
        h5.ritaCel(g);
        h6.ritaCel(g);
        h7.ritaCel(g);
        h8.ritaCel(g);
        
        
    }
}


*/
