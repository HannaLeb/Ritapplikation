package com.company;

import java.awt.*;

public class Oval extends Figure {
    public Oval(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        super.draw(g);
        if(width > 0 && height > 0) {
            g.drawOval(x, y, width, height);
        }
        else if(width < 0 && height < 0){
            g.drawOval(x+width, y+height,-width, -height);
        }
        else if( width < 0 && height > 0){
            g.drawOval(x+width, y, -width, height);
        }
        else if(width > 0 && height < 0) {
            g.drawOval(x, y+height, width, -height);
        }

    }
}
