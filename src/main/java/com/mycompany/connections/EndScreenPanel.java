package com.mycompany.connections;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class EndScreenPanel extends JPanel{

    JLabel box1, box2, box3, box4, ggtext;

    public EndScreenPanel(){

        this.setLayout(null);
        this.setBackground(Color.WHITE);

        box1 = new JLabel();
        box1.setOpaque(true);
        box1.setBounds(50, 90, 230, 50);
        box1.setBorder(new RoundBorder(16));
        box1.setBackground(new Color(0xba81c5));
        box1.setForeground(new Color(0xba81c5));
        this.add(box1);

        box2 = new JLabel();
        box2.setOpaque(true);
        box2.setBounds(50, 150, 230, 50);
        box2.setBorder(new RoundBorder(16));
        box2.setBackground(new Color(0xb0c4ef));
        box2.setForeground(new Color(0xb0c4ef));
        this.add(box2);

        box3 = new JLabel();
        box3.setOpaque(true);
        box3.setBounds(50, 210, 230, 50);
        box3.setBorder(new RoundBorder(16));
        box3.setBackground(new Color(0xa0c35a));
        box3.setForeground(new Color(0xa0c35a));
        this.add(box3);

        box4 = new JLabel();
        box4.setOpaque(true);
        box4.setBounds(50, 270, 230, 50);
        box4.setBorder(new RoundBorder(16));
        box4.setBackground(new Color(0xf9df6d));
        box4.setForeground(new Color(0xf9df6d));
        this.add(box4);

        ggtext = new JLabel("GG you won.");
        ggtext.setFont(new Font("Sanserif", 0, 24));
        ggtext.setBounds(100, 20, 400, 80);
        this.add(ggtext);


    }

    static class RoundBorder extends AbstractBorder {
        private int radius;

        public RoundBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(c.getForeground());
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius));
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius, this.radius, this.radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = this.radius;
            return insets;
        }
    }

}
