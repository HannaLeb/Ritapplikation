package com.company;

import java.awt.*;

public class Oval extends Figure {
    public Oval(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        super.draw(g);
        if(width > 0 && height > 0) {
            DrawOval(x, y, width, height, g);
        }
        else if(width < 0 && height < 0){
            DrawOval(x+width, y+height,-width, -height, g);
        }
        else if( width < 0 && height > 0){
            DrawOval(x+width, y, -width, height, g);
        }
        else if(width > 0 && height < 0) {
            DrawOval(x, y+height, width, -height, g);
        }
    }

    public void DrawOval(int x, int y, int width, int height, Graphics g) {
        g.setColor(fillColor);
        g.fillOval(x,y, width, height);
        g.setColor(color);
        g.drawOval(x, y, width, height);
    }
}
