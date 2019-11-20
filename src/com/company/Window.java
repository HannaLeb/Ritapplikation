package com.company;


import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        JLabel l = new JLabel();
        JMenuBar mb = new JMenuBar();

        JMenu x, x1;
        JMenu y;
        JMenuItem m1, m2, s1, m4, m5, y1, y2;

        x = new JMenu("File");
        y = new JMenu("Edit");
        x1 = new JMenu("Open recent file");

        s1 = new JMenuItem("...");
        m1 = new JMenuItem("New");
        m2 = new JMenuItem("Open...");
        m4 = new JMenuItem("Save as");
        m5 = new JMenuItem("Exit");

        y1 = new JMenuItem("Cut");
        y2 = new JMenuItem("Copy");

        x.add(m1);
        x.add(m2);
        x1.add(s1);

        x.add(x1);
        x.add(m4);
        x.add(m5);

        y.add(y1);
        y.add(y2);

        mb.add(x);
        mb.add(y);

        setJMenuBar(mb);
        add(l);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(50, 50);

        Panel panel = new Panel();
        ToolBox toolbox = new ToolBox();
        JToolBar controls = toolbox.createControls(panel);
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        content.add(controls, BorderLayout.WEST);
        add(panel);
        panel.addMouseListener(panel);
        panel.addMouseMotionListener(panel);
        validate();
        setVisible(true);
    }
}


