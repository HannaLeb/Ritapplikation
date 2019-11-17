package com.company;

import java.awt.*;

public class Figure {
    int x = 0;
    int y = 0;
    int width = 0;
    int height= 0;
    Color color;
    Color fillColor;


    public Figure(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.fillColor = new Color(0,0,0,0);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(color);
        g2.setStroke(new BasicStroke(8));

    }

    public void setFillColor(Color color) {
        fillColor = color;
    }
}

