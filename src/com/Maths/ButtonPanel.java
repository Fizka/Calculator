package com.Maths;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JFrame implements ActionListener {

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
    private JButton enterButton;
    private JButton nextButton;
    private JButton prevButton;
    private JTextField WindowWithResult;
    private JTextField WindowWithnote;
    private JTextField WindowWithComunicat;
    private JLabel resultLabel;

    private JPanel sub1;

    public ButtonPanel(){

        sub1 = new JPanel();

        WindowWithComunicat = new JTextField();
        WindowWithComunicat.setColumns(20);
        WindowWithComunicat.setPreferredSize(new Dimension(20,20));
        WindowWithComunicat.setMaximumSize(new Dimension(230,20));
        WindowWithResult = new JTextField("0", 20);
        WindowWithnote = new JTextField("0",20);
        resultLabel = new JLabel("FUCK Y");
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
         enterButton = new JButton("ENTER");
         nextButton = new JButton(">");
         prevButton = new JButton("<");

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
       // what the fuck going on?  WindowWithnote.addFocusListener(this);
        WindowWithResult.setEditable(false);
        //dorzuc enter - akcja


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(WindowWithComunicat) // text
                .addComponent(WindowWithnote) // text with number
                .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLabel)
                        .addComponent(WindowWithResult)
                )
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(oneButton) //1
                                    .addComponent(fourButton) //4
                                    .addComponent(sevenButton) //7
                            )
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(twoButton) //2
                                    .addComponent(fiveButton) //5
                                    .addComponent(eightButton) //8
                                    .addComponent(zeroButton) //0
                            )
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(threeButton) //3
                                    .addComponent(sixButton) //6
                                    .addComponent(nineButton) //9
                            )

                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(plusButton)
                                    .addComponent(minusButton)
                                )
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(multiplicationButton)
                                        .addComponent(dividerButton)
                                )
                                .addComponent(enterButton)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(deleteButton)
                                .addComponent(nextButton)
                                .addComponent(prevButton)
                                .addComponent(equalButton)
                        )
                )
        );

        layout.linkSize(SwingConstants.HORIZONTAL, oneButton, twoButton, threeButton, fourButton,
                fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton);
        layout.linkSize(SwingConstants.HORIZONTAL, deleteButton, nextButton, prevButton, equalButton);
        layout.linkSize(SwingConstants.HORIZONTAL, plusButton, multiplicationButton);
        layout.linkSize(SwingConstants.HORIZONTAL, WindowWithComunicat, WindowWithnote);
        layout.linkSize(SwingConstants.HORIZONTAL, minusButton, dividerButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(WindowWithComunicat)
                        .addComponent(WindowWithnote)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(resultLabel)
                                .addComponent(WindowWithResult)
                        )
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(oneButton)
                                        .addComponent(twoButton)
                                        .addComponent(threeButton)
                                )
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(fourButton)
                                        .addComponent(fiveButton)
                                        .addComponent(sixButton)
                                )
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(sevenButton)
                                        .addComponent(eightButton)
                                        .addComponent(nineButton)
                                )
                                .addComponent(zeroButton)
                        )
                        .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(plusButton)
                                                .addComponent(multiplicationButton)
                                                )
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(minusButton)
                                                .addComponent(dividerButton)
                                                 )
                                        )
                                        .addComponent(enterButton)
                                )
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addComponent(nextButton)
                                .addComponent(prevButton)
                                .addComponent(equalButton)
                        )
                ));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));

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
