package com.company;

import java.awt.*;

public class Rectangle extends Figure {
    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        super.draw(g);
        if(width > 0 && height > 0) {
            drawRectangle(x, y, width, height, g);
        }
        else if(width < 0 && height < 0){
            drawRectangle(x+width, y+height,-width, -height, g);
        }
        else if( width < 0 && height > 0){
            drawRectangle(x+width, y, -width, height, g);
        }
        else if(width > 0 && height < 0) {
            drawRectangle(x, y+height, width, -height, g);
        }
    }

    public void drawRectangle(int x, int y, int width, int height, Graphics g) {
        g.setColor(fillColor);
        g.fillRect(x, y, width, height);
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}
