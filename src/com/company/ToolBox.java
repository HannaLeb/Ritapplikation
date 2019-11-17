package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBox {
    JButton arrowBtn, pencilBtn, rectangleBtn, ovalBtn, polygonBtn, drawLineBtn, graphicBtn, blackBtn, yellowBtn, greenBtn, blueBtn, colorsBtn, fillColorBtn, backgroundBtn, clearBtn;
    Panel panel;
    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == arrowBtn) {
                panel.arrow();
            }else if(e.getSource() == rectangleBtn) {
                panel.rectangle();
            }else if(e.getSource() == ovalBtn) {
                panel.oval();
            }else if(e.getSource() == polygonBtn) {
                panel.polygon();
            }else if(e.getSource() == drawLineBtn) {
                panel.drawLine();
            }else if(e.getSource() == pencilBtn) {
                panel.pencil();
            }else if(e.getSource() == graphicBtn) {
                panel.graphicLines();
            }else if(e.getSource() == colorsBtn) {
                panel.colors();
            }else if(e.getSource() == blackBtn) {
                panel.black();
            }else if(e.getSource() == yellowBtn) {
                panel.yellow();
            }else if(e.getSource() == greenBtn) {
                panel.green();
            }else if(e.getSource() == blueBtn) {
                panel.blue();
            }else if(e.getSource()== fillColorBtn) {
                panel.fillcolor();
            }else if(e.getSource() == backgroundBtn) {
                panel.background();
            }else if(e.getSource() == clearBtn) {
                panel.clear();
            }
        }
    } ;

    public JToolBar createControls(Panel panel) {
        this.panel = panel;

        //create controls to apply colors and call clear feature
        JToolBar controls = new JToolBar();

        arrowBtn = new JButton(" ");
        arrowBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Pil.png"));
        //"C:\\Users\\Bruker\\Desktop\\Pil.png"
        arrowBtn.addActionListener(actionListener);

        pencilBtn = new JButton(" ");
        pencilBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Pencil.png"));
        //       pencilBtn.setIcon(new ImageIcon("./resources/images/Pencil.png"));
        pencilBtn.addActionListener(actionListener);

        rectangleBtn = new JButton(" ");  //byt ut rectangle till bild
        rectangleBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Rectangle.png"));
        //rectangleBtn.add(rectangleBtn);
        //add(rectangleBtn);
        rectangleBtn.addActionListener(actionListener);

        ovalBtn = new JButton(" ");
        ovalBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Oval.png"));
        ovalBtn.addActionListener(actionListener);

        polygonBtn = new JButton(" ");
        polygonBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Polygon.png"));
        polygonBtn.addActionListener(actionListener);

        drawLineBtn = new JButton(" ");
        drawLineBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\DrawLine.png"));
        drawLineBtn.addActionListener(actionListener);


        graphicBtn = new JButton(" ");
        graphicBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Grapich.png"));
        graphicBtn.addActionListener(actionListener);


        colorsBtn = new JButton(" ");
        colorsBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Colors.png"));
        colorsBtn.addActionListener(actionListener);

        blackBtn = new JButton(" ");
        blackBtn.setBackground(Color.black);
        blackBtn.addActionListener(actionListener);

        yellowBtn = new JButton(" ");
        yellowBtn.setBackground(Color.yellow);
        yellowBtn.addActionListener(actionListener);

        greenBtn = new JButton(" ");
        greenBtn.setBackground(Color.green);
        greenBtn.addActionListener(actionListener);

        blueBtn = new JButton(" ");
        blueBtn.setBackground(Color.blue);
        blueBtn.addActionListener(actionListener);

        fillColorBtn =new JButton(" ");
        fillColorBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Fillcolor.png"));
        fillColorBtn.addActionListener(actionListener);

        backgroundBtn = new JButton("Background color");
        backgroundBtn.addActionListener(actionListener);

        clearBtn = new JButton(" ");
        clearBtn.setIcon(new ImageIcon("C:\\Users\\Bruker\\Desktop\\Papperskorg.png"));
        clearBtn.addActionListener(actionListener);




        //add to panel
        controls.setLayout(new GridLayout(0,1));
        controls.add(arrowBtn);
        controls.add(pencilBtn);
        controls.add(rectangleBtn);
        controls.add(ovalBtn);
        controls.add(polygonBtn);
        controls.add(drawLineBtn);
        controls.add(graphicBtn);
        controls.add(colorsBtn);
        controls.add(blackBtn);
        controls.add(yellowBtn);
        controls.add(greenBtn);
        controls.add(blueBtn);
        controls.add(fillColorBtn);
        controls.add(backgroundBtn);
        controls.add(clearBtn);

        return controls;
    }
}
