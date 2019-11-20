package com.company;

import java.awt.*;

public class GraphicLines extends Pencil {
    private Point lastPoint;

    public GraphicLines(Color color) {
        super(color);
    }

    public void draw(Graphics g) {
        if(xList.size() <2) {
            return;
        }
        super.draw(g);
        Graphics2D g2 =(Graphics2D)g;
        g2.setStroke(new BasicStroke(1));
        for(int i=0; i<xList.size() -1; i++) {
            int x1 = xList.get(0);
            int y1 = yList.get(0);
            int x2 = xList.get(i+1);
            int y2 = yList.get(i+1);
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
