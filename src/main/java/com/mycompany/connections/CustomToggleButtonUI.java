package com.mycompany.connections;

import javax.swing.*;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import java.awt.*;
import java.awt.event.*;

public class CustomToggleButtonUI extends BasicToggleButtonUI {
    private Color selectedColor;
    private Color deselectedColor;

    public CustomToggleButtonUI(Color selectedColor, Color deselectedColor) {
        this.selectedColor = selectedColor;
        this.deselectedColor = deselectedColor;
    }

    // Paint method to customize appearance
    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        ButtonModel model = button.getModel();

        if (model.isSelected()) {
            button.setBackground(selectedColor);
            button.setForeground(Color.WHITE);
        } else {
            button.setBackground(deselectedColor);
            button.setForeground(Color.BLACK);
        }

        super.paint(g, c);
    }
}