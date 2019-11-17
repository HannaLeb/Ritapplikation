package com.company;

import java.awt.*;

public class DrawLine extends Figure {
    public DrawLine(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawLine(x, y, x+width, y+height);
    }
}
