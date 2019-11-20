package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Pencil extends Figure {
    ArrayList<Integer> xList;
    ArrayList<Integer> yList;

    public Pencil(Color color) {
        super(0, 0, 0, 0, color);
        xList = new ArrayList<Integer>();
        yList = new ArrayList<Integer>();
    }

    public void addPoint(int x, int y) {
        xList.add(x);
        yList.add(y);

    }

    public void draw(Graphics g) {
        if(xList.size() <2) {
            return;
        }
        super.draw(g);
        for(int i=0; i<xList.size() -1; i++) {
            int x1 = xList.get(i);
            int y1 = yList.get(i);
            int x2 = xList.get(i+1);
            int y2 = yList.get(i+1);
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
