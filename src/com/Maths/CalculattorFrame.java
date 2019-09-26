package com.Maths;

import javax.swing.*;
import java.awt.*;

public class CalculattorFrame extends JFrame {

    public CalculattorFrame() {

        super("Calculator");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

}
