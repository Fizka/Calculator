package com.Maths;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 400;
    public static  final  int WIDTH = 400;

    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton equalButton;
    private JButton dividerButton;
    private JButton multiplicationButton;
    private JButton deleteButton;
    private JButton nextButton;
    private JButton prevButton;
    private JTextField WindowWithResult;
    private JTextField WindowWithnote;
    private JLabel resultLabel;

    private JPanel sub1,sub2,sub3,sub4;

    public ButtonPanel(){

        sub1 = new JPanel();
        sub2 = new JPanel();
        sub3 = new JPanel();
        sub4 = new JPanel();


        WindowWithResult = new JTextField("         ");
        WindowWithnote = new JTextField("0",20);
        resultLabel = new JLabel("Result: ");
         oneButton = new JButton("1");
         twoButton = new JButton("2");
         threeButton = new JButton("3");
         fourButton = new JButton("4");
         fiveButton = new JButton("5");
         sixButton = new JButton("6");
         sevenButton = new JButton("7");
         eightButton = new JButton("8");
         nineButton = new JButton("9");
         zeroButton = new JButton("0");
         plusButton = new JButton("+");
         minusButton = new JButton("-");
         equalButton = new JButton("=");
         dividerButton = new JButton("/");
         multiplicationButton = new JButton("*");
         deleteButton = new JButton("DEL");
         nextButton = new JButton("->");
         prevButton = new JButton("<-");

        //WindowWithResult.setBounds(40,40,40,40);

        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        zeroButton.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        equalButton.addActionListener(this);
        dividerButton.addActionListener(this);
        multiplicationButton.addActionListener(this);
        deleteButton.addActionListener(this);
        nextButton.addActionListener(this);
        prevButton.addActionListener(this);
        WindowWithnote.addFocusListener(this);
        WindowWithResult.setEditable(false);

       // GridLayout gl = new GridLayout();
        //do zmiany
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));

        add(oneButton);
        add(twoButton);
        add(threeButton);
        add(fourButton);
        add(fiveButton);
        add(sixButton);
        add(sevenButton);
        add(eightButton);
        add(nineButton);
        add(zeroButton);
        add(plusButton);
        add(minusButton);
        add(equalButton);
        add(dividerButton);
        add(multiplicationButton);
        add(deleteButton);
        add(nextButton);
        add(prevButton);
        add(WindowWithResult);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == oneButton)
            setBackground(Color.BLUE);

        else if(source == twoButton)
            setBackground(Color.BLUE);

        else if(source == threeButton)
            setBackground(Color.BLUE);

        else if(source == fourButton)
            setBackground(Color.CYAN);

        else if(source == fiveButton)
            setBackground(Color.CYAN);

        else if(source == sixButton)
            setBackground(Color.CYAN);

        else if(source == sevenButton)
            setBackground(Color.GRAY);

        else if(source == eightButton)
            setBackground(Color.GRAY);

        else if(source == nineButton)
            setBackground(Color.GRAY);

        else if(source == zeroButton)
            setBackground(Color.LIGHT_GRAY);

        else if(source == plusButton)
            setBackground(Color.PINK);

        else if(source == minusButton)
            setBackground(Color.PINK);

        else if(source == equalButton)
            setBackground(Color.PINK);

        else if(source == dividerButton)
            setBackground(Color.PINK);

        else if(source == multiplicationButton)
            setBackground(Color.PINK);

        else if(source == deleteButton)
            setBackground(Color.PINK);

        else if(source == nextButton)
            setBackground(Color.PINK);

        else if(source == prevButton)
            setBackground(Color.PINK);

    }
}
