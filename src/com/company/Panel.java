package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.KeyEvent;

public class Panel extends JPanel
        implements MouseListener, MouseMotionListener, KeyListener {
    ArrayList<Figure> figures = new ArrayList<Figure>();
    int clickX;
    int clickY;
    Color color = Color.black;
    Color background = Color.white;

    private Image image;
    private Graphics2D g2;
    private int currentX, currentY, oldX, oldY;
    private Point lastPoint;

    enum ToolSelection {
        RECTANGLE,
        OVAL,
        POLYGON,
        DRAWLINE,
        PENCIL,
        GRAPHIC,
        NOTHING
    }

    ToolSelection toolSelection = ToolSelection.NOTHING;

    public Panel() {
        this.image = image;
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                oldX=getX();
                oldY=getY();
                lastPoint = new Point(e.getX(), e.getY());
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image == null) {
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D)image.getGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();
        }
        g.drawImage(image, 0, 0, null);
        g.setColor(background);
        g.fillRect(0, 0, getWidth(), getHeight());
        g2 = (Graphics2D)g;
        for(int i=0; i<figures.size(); i++) {
                figures.get(i).draw(g);
        }
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        clickX = e.getX();
        clickY = e.getY();
        if (toolSelection == toolSelection.RECTANGLE) {
            Figure rectangle1 = new Rectangle(clickX, clickY, 0, 0, color);
            addFigure(rectangle1);
        }
        else if (toolSelection == toolSelection.OVAL) {
            Figure oval1 = new Oval(clickX, clickY, 0, 0, color);
            addFigure(oval1);
        }
        else if (toolSelection == toolSelection.POLYGON) {
            Figure polygon1 = new Polygon(clickX, clickY, 0, 0, color);
            addFigure(polygon1);
        }
        else if (toolSelection == toolSelection.DRAWLINE) {
            Figure drawLine1 = new DrawLine(clickX, clickY, 0, 0, color);
            addFigure(drawLine1);
        }
        else if (toolSelection == toolSelection.PENCIL) {
            Figure pencil1 = new Pencil(color);
            addFigure(pencil1);
        }
        else if (toolSelection == toolSelection.GRAPHIC) {
            Figure graphic1 = new GraphicLines(color);
            addFigure(graphic1);
        }
        this.repaint();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if(toolSelection == ToolSelection.PENCIL || toolSelection == ToolSelection.GRAPHIC) {
            Figure figure1 = figures.get(figures.size() - 1);
            Pencil pencil1 = (Pencil)figure1;
            pencil1.addPoint(x, y);
        }

        else if(toolSelection != ToolSelection.NOTHING) {
            Figure figure1 = figures.get(figures.size() - 1);
            int width = x - clickX;
            int height = y - clickY;
            figure1.setWidth(width);
            figure1.setHeight(height);
        }
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public void arrow() {
    }

    public void clear() {
        figures.clear();
        background = Color.white;
        repaint();
    }

    public void colors() {
        Color newColor = JColorChooser.showDialog(this, "Choose a color", color);
        if (newColor != null) {
            color = newColor;
        }
    }

    public void yellow() {
        color = Color.yellow;
    }

    public void black() {
        color = Color.black;
    }

    public void green() {
        color = Color.green;
    }

    public void blue() {
        color = Color.blue;
    }


    public void background() {
        background = color;
        setOpaque(true);
        repaint();
    }

    public void fillcolor() {
        if(figures.size() > 0) {
            Figure figure = figures.get(figures.size()-1);
            figure.setFillColor(color);
            repaint();
        }
    }

    public void rectangle() {
        toolSelection = ToolSelection.RECTANGLE;
    }

    public void oval() {
        toolSelection = ToolSelection.OVAL;
    }

    public void polygon() {
        toolSelection = ToolSelection.POLYGON;
    }

    public void drawLine() {
        toolSelection = ToolSelection.DRAWLINE;
    }

    public void pencil() {
        toolSelection = ToolSelection.PENCIL;
    }

    public void graphicLines() {
        toolSelection = ToolSelection.GRAPHIC;
    }
}
