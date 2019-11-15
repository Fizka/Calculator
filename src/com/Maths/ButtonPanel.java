package com.Maths;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JFrame implements ActionListener {

    private String stringText;
    private String outcome;

    public static final int HEIGHT = 500;
    public static  final  int WIDTH = 500;

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

    Color ButtonColor = Color.CYAN;

    public ButtonPanel(){

        super("Magic Calculator");

        sub1 = new JPanel();

        WindowWithComunicat = new JTextField();
        WindowWithComunicat.setColumns(20);
        WindowWithComunicat.setEditable(false);
        WindowWithComunicat.setBackground(Color.lightGray);

        WindowWithResult = new JTextField("", 20);
        WindowWithResult.setEditable(false);
        WindowWithResult.setBackground(Color.LIGHT_GRAY);

        WindowWithnote = new JTextField("",20);

        resultLabel = new JLabel("OUTCOME =");
        resultLabel.setFont(resultLabel.getFont().deriveFont(32.0f));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setVerticalAlignment(SwingConstants.CENTER);

        CreateButtons();

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
                        .addGap(20)
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
                        .addGap(20)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(deleteButton)
                                .addComponent(nextButton)
                                .addComponent(prevButton)
                                .addComponent(equalButton)
                        )
                )
        );

                /*
                layout.linkSize(SwingConstants.HORIZONTAL, oneButton, twoButton, threeButton, fourButton,
                fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton);

                layout.linkSize(SwingConstants.HORIZONTAL, plusButton, multiplicationButton);
                layout.linkSize(SwingConstants.HORIZONTAL, WindowWithComunicat, WindowWithnote);
                layout.linkSize(SwingConstants.HORIZONTAL, minusButton, dividerButton);
        */

        layout.linkSize(SwingConstants.VERTICAL,resultLabel,WindowWithResult);
        layout.linkSize(SwingConstants.HORIZONTAL, deleteButton, nextButton, prevButton, equalButton);

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
                        .addGap(20)
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
                        .addGap(20)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addComponent(nextButton)
                                .addComponent(prevButton)
                                .addComponent(equalButton)
                        )
                ));
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    void CreateButtons(){

        oneButton = new JButton("1");
        oneButton.setSize(60,60);
        oneButton.setMinimumSize(new Dimension(60,60));
        oneButton.setFont(oneButton.getFont().deriveFont(32.0f));
        oneButton.setHorizontalAlignment(SwingConstants.CENTER);
        oneButton.setBackground(ButtonColor);
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setSize(60,60);
        twoButton.setMinimumSize(new Dimension(60,60));
        twoButton.setFont(twoButton.getFont().deriveFont(32.0f));
        twoButton.setHorizontalAlignment(SwingConstants.CENTER);
        twoButton.setBackground(ButtonColor);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setSize(60,60);
        threeButton.setMinimumSize(new Dimension(60,60));
        threeButton.setFont(threeButton.getFont().deriveFont(32.0f));
        threeButton.setHorizontalAlignment(SwingConstants.CENTER);
        threeButton.setBackground(ButtonColor);
        threeButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setSize(60,60);
        fourButton.setMinimumSize(new Dimension(60,60));
        fourButton.setFont(fourButton.getFont().deriveFont(32.0f));
        fourButton.setHorizontalAlignment(SwingConstants.CENTER);
        fourButton.setBackground(ButtonColor);
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setSize(60,60);
        fiveButton.setMinimumSize(new Dimension(60,60));
        fiveButton.setFont(fiveButton.getFont().deriveFont(32.0f));
        fiveButton.setHorizontalAlignment(SwingConstants.CENTER);
        fiveButton.setBackground(ButtonColor);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setSize(60,60);
        sixButton.setMinimumSize(new Dimension(60,60));
        sixButton.setFont(sixButton.getFont().deriveFont(32.0f));
        sixButton.setHorizontalAlignment(SwingConstants.CENTER);
        sixButton.setBackground(ButtonColor);
        sixButton.addActionListener(this);

        sevenButton = new JButton("7");
        sevenButton.setSize(60,60);
        sevenButton.setMinimumSize(new Dimension(60,60));
        sevenButton.setFont(sevenButton.getFont().deriveFont(32.0f));
        sevenButton.setHorizontalAlignment(SwingConstants.CENTER);
        sevenButton.setBackground(ButtonColor);
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setSize(60,60);
        eightButton.setMinimumSize(new Dimension(60,60));
        eightButton.setFont(eightButton.getFont().deriveFont(32.0f));
        eightButton.setHorizontalAlignment(SwingConstants.CENTER);
        eightButton.setBackground(ButtonColor);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setSize(60,60);
        nineButton.setMinimumSize(new Dimension(60,60));
        nineButton.setFont(nineButton.getFont().deriveFont(32.0f));
        nineButton.setHorizontalAlignment(SwingConstants.CENTER);
        nineButton.setBackground(ButtonColor);
        nineButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setSize(60,60);
        zeroButton.setMinimumSize(new Dimension(60,60));
        zeroButton.setFont(zeroButton.getFont().deriveFont(32.0f));
        zeroButton.setHorizontalAlignment(SwingConstants.CENTER);
        zeroButton.setBackground(ButtonColor);
        zeroButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setSize(60,60);
        plusButton.setMinimumSize(new Dimension(60,60));
        plusButton.setFont(plusButton.getFont().deriveFont(32.0f));
        plusButton.setHorizontalAlignment(SwingConstants.CENTER);
        plusButton.setBackground(ButtonColor);
        plusButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setSize(60,60);
        minusButton.setMinimumSize(new Dimension(60,60));
        minusButton.setFont(minusButton.getFont().deriveFont(32.0f));
        minusButton.setHorizontalAlignment(SwingConstants.CENTER);
        minusButton.setBackground(ButtonColor);
        minusButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setSize(60,60);
        equalButton.setMinimumSize(new Dimension(60,60));
        equalButton.setFont(equalButton.getFont().deriveFont(32.0f));
        equalButton.setHorizontalAlignment(SwingConstants.CENTER);
        equalButton.setBackground(ButtonColor);
        equalButton.addActionListener(this);

        dividerButton = new JButton("/");
        dividerButton.setSize(60,60);
        dividerButton.setMinimumSize(new Dimension(60,60));
        dividerButton.setFont(dividerButton.getFont().deriveFont(32.0f));
        dividerButton.setHorizontalAlignment(SwingConstants.CENTER);
        dividerButton.setBackground(ButtonColor);
        dividerButton.addActionListener(this);


        multiplicationButton = new JButton("*");
        multiplicationButton.setSize(60,60);
        multiplicationButton.setMinimumSize(new Dimension(60,60));
        multiplicationButton.setFont(multiplicationButton.getFont().deriveFont(32.0f));
        multiplicationButton.setHorizontalAlignment(SwingConstants.CENTER);
        multiplicationButton.setBackground(ButtonColor);
        multiplicationButton.addActionListener(this);


        deleteButton = new JButton("DEL");
        deleteButton.setFont(deleteButton.getFont().deriveFont(16.0f));
        deleteButton.setBackground(ButtonColor);
        deleteButton.addActionListener(this);

        enterButton = new JButton("ENTER");
        enterButton.setFont(enterButton.getFont().deriveFont(26.5f));
        enterButton.setBackground(ButtonColor);
        enterButton.addActionListener(this);

        nextButton = new JButton(">");
        nextButton.setFont(nextButton.getFont().deriveFont(32.0f));
        nextButton.setBackground(ButtonColor);
        nextButton.addActionListener(this);

        prevButton = new JButton("<");
        prevButton.setFont(prevButton.getFont().deriveFont(32.0f));
        prevButton.setBackground(ButtonColor);
        prevButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        stringText = getWindowWithnote();

        if(source == oneButton)
        {
            stringText+="1";
        }

        else if(source == twoButton)
        {
            stringText+="2";
        }

        else if(source == threeButton)
        {
            stringText+="3";
        }
        else if(source == fourButton)
        {
            stringText+="4";
        }

        else if(source == fiveButton)
        {
            stringText+="5";
        }

        else if(source == sixButton)
        {
            stringText+="6";
        }

        else if(source == sevenButton)
        {
            stringText+="7";
        }

        else if(source == eightButton)
        {
            stringText+="8";
        }

        else if(source == nineButton)
        {
            stringText+="9";
        }

        else if(source == zeroButton)
        {
            stringText+="0";
        }

        else if(source == plusButton)
        {
            stringText+=" + ";
        }

        else if(source == minusButton)
        {
            stringText+=" - ";
        }

        else if(source == equalButton)
        {
            stringText+=" = ";
        }

        else if(source == dividerButton)
        {
            stringText+=" / ";
        }

        else if(source == multiplicationButton)
        {
            stringText+=" * ";
        }

        else if(source == deleteButton)
        {

            stringText = getWindowWithnote();
            int i = stringText.length();
            char b[] = new char[i];

            String[] znaki = stringText.split(" ");
            if(znaki.length > 1)
            {
                stringText="";
                for (int x = 1; x < znaki.length; x++) {
                    stringText += znaki[x - 1];
                    if((znaki.length-1) != x )
                        stringText +=" ";
                }

            }
            else{

                for (int x = 0; x < i - 1; x++)
                    b[x] = stringText.charAt(x);

                stringText = String.valueOf(b);
            }

        }

        else if(source == nextButton)
        {
            stringText+=" ";
        }

        else if(source == prevButton)
        {
            stringText+=" ";
        }

        setWindowWithnote(stringText);

    }

    public String getWindowWithResult() {
        return WindowWithResult.getText();
    }

    public String getWindowWithnote() {
        return WindowWithnote.getText();
    }

    public String getWindowWithComunicat() {
        return WindowWithComunicat.getText();
    }

    public void setWindowWithResult(String text) {
        WindowWithResult.setText(text);
    }

    public void setWindowWithnote(String text) {
        WindowWithnote.setText(text);
    }

    public void setWindowWithComunicat(String text) {
        WindowWithComunicat.setText(text);
    }

}
