package com.company;

import java.awt.*;

public class Polygon extends Figure{
    public Polygon(int x, int y, int width, int height,  Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        int xPoints[] = {1* width /4 + x , 0 + x, 1 * width/4+ x, 3* width /4+ x, 4 * width/4+ x, 3 *width/4+ x};
        int yPoints[] = {4*height/4 + y, 2*height/4 + y, 0 + y , 0 + y, 2*height/4 + y, 4*height/4 + y};
        int nPoints = 6;
        super.draw(g);
        g.drawPolygon(xPoints, yPoints, nPoints);

    }
}


