package com.Maths;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JFrame {

    private String stringText;
    private String outcome;

    public static final int HEIGHT = 500;
    public static  final  int WIDTH = 530;

    protected JButton oneButton;
    protected JButton twoButton;
    protected JButton threeButton;
    protected JButton fourButton;
    protected JButton fiveButton;
    protected JButton sixButton;
    protected JButton sevenButton;
    protected JButton eightButton;
    protected JButton nineButton;
    protected JButton zeroButton;
    protected JButton plusButton;
    protected JButton minusButton;
    protected JButton equalButton;
    protected JButton dividerButton;
    protected JButton multiplicationButton;
    protected JButton rightbracketsButton;
    protected JButton leftbracketsButton;
    protected JButton enterButton;
    protected JButton powerButton; //potega
    protected JButton strongButton; //silnia
    protected JButton squareButton; //pierwiastek
    protected JButton moduloButton; //
    protected JTextField WindowWithResult;
    protected JTextField WindowWithnote;
    protected JTextArea WindowWithComunicat;
    protected JLabel resultLabel;
    protected JButton Delete;

    private JPanel sub1;

    Color ButtonColor = Color.CYAN;

    public ButtonPanel(){

        super("ONP Kalkulator");

        sub1 = new JPanel();

        WindowWithComunicat = new JTextArea();
        WindowWithComunicat.setColumns(20);
        WindowWithComunicat.setPreferredSize(new Dimension(400, 50));
        WindowWithComunicat.setEditable(false);
        WindowWithComunicat.setBackground(Color.lightGray);
        WindowWithComunicat.setText("\n   Instrukcja: Wpisz równanie, nastepnie nacisnij ENTER.\n   Nie zapomnij wpisac znaku \"=\" na koncu.\n");

        WindowWithResult = new JTextField("", 20);
        WindowWithResult.setEditable(false);
        WindowWithResult.setBackground(Color.LIGHT_GRAY);

        WindowWithnote = new JTextField("",20);
        WindowWithnote.setPreferredSize(new Dimension(400, 50));

        resultLabel = new JLabel("WYNIK =");
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
                                .addComponent(equalButton)
                                .addComponent(enterButton)
                        )
                        .addGap(20)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(squareButton)
                                        .addComponent(rightbracketsButton)

                                )
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(powerButton)
                                        .addComponent(leftbracketsButton)

                                )
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(moduloButton)
                                        .addComponent(strongButton)

                                )
                                .addComponent(Delete)
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

        //layout.linkSize(SwingConstants.HORIZONTAL, rightbracketsButton,strongButton ,leftbracketsButton);
        layout.linkSize(SwingConstants.HORIZONTAL, enterButton, equalButton);
        layout.linkSize(SwingConstants.VERTICAL,enterButton,Delete);

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
                                            .addComponent(equalButton)
                                            .addComponent(enterButton)
                                    )
                            )
                            .addGap(20)

                            .addGroup(layout.createParallelGroup()
                                    .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addGroup(layout.createSequentialGroup()
                                                            .addComponent(squareButton)
                                                            .addComponent(powerButton)
                                                            .addComponent(moduloButton)
                                                    )
                                                    .addGroup(layout.createSequentialGroup()
                                                            .addComponent(rightbracketsButton)
                                                            .addComponent(leftbracketsButton)
                                                            .addComponent(strongButton)
                                                    )

                                            )
                                            .addComponent(Delete)
                                    )
                            )





                ));
        this.setMinimumSize(new Dimension(530,500)); //zabezpieczenie przed zmiana rozmiaru - rozmar minimalny
        this.setMaximumSize(new Dimension(530,700)); //zabezpieczenie przed zmiana rozmiaru - rozmar maksymalny
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
        oneButton.addActionListener(new ButtonClick(this));
        oneButton.setActionCommand("oneButton");

        twoButton = new JButton("2");
        twoButton.setSize(60,60);
        twoButton.setMinimumSize(new Dimension(60,60));
        twoButton.setFont(twoButton.getFont().deriveFont(32.0f));
        twoButton.setHorizontalAlignment(SwingConstants.CENTER);
        twoButton.setBackground(ButtonColor);
        twoButton.addActionListener(new ButtonClick(this));
        twoButton.setActionCommand("twoButton");

        threeButton = new JButton("3");
        threeButton.setSize(60,60);
        threeButton.setMinimumSize(new Dimension(60,60));
        threeButton.setFont(threeButton.getFont().deriveFont(32.0f));
        threeButton.setHorizontalAlignment(SwingConstants.CENTER);
        threeButton.setBackground(ButtonColor);
        threeButton.addActionListener(new ButtonClick(this));
        threeButton.setActionCommand("threeButton");

        fourButton = new JButton("4");
        fourButton.setSize(60,60);
        fourButton.setMinimumSize(new Dimension(60,60));
        fourButton.setFont(fourButton.getFont().deriveFont(32.0f));
        fourButton.setHorizontalAlignment(SwingConstants.CENTER);
        fourButton.setBackground(ButtonColor);
        fourButton.addActionListener(new ButtonClick(this));
        fourButton.setActionCommand("fourButton");

        fiveButton = new JButton("5");
        fiveButton.setSize(60,60);
        fiveButton.setMinimumSize(new Dimension(60,60));
        fiveButton.setFont(fiveButton.getFont().deriveFont(32.0f));
        fiveButton.setHorizontalAlignment(SwingConstants.CENTER);
        fiveButton.setBackground(ButtonColor);
        fiveButton.addActionListener(new ButtonClick(this));
        fiveButton.setActionCommand("fiveButton");

        sixButton = new JButton("6");
        sixButton.setSize(60,60);
        sixButton.setMinimumSize(new Dimension(60,60));
        sixButton.setFont(sixButton.getFont().deriveFont(32.0f));
        sixButton.setHorizontalAlignment(SwingConstants.CENTER);
        sixButton.setBackground(ButtonColor);
        sixButton.addActionListener(new ButtonClick(this));
        sixButton.setActionCommand("sixButton");

        sevenButton = new JButton("7");
        sevenButton.setSize(60,60);
        sevenButton.setMinimumSize(new Dimension(60,60));
        sevenButton.setFont(sevenButton.getFont().deriveFont(32.0f));
        sevenButton.setHorizontalAlignment(SwingConstants.CENTER);
        sevenButton.setBackground(ButtonColor);
        sevenButton.addActionListener(new ButtonClick(this));
        sevenButton.setActionCommand("sevenButton");

        eightButton = new JButton("8");
        eightButton.setSize(60,60);
        eightButton.setMinimumSize(new Dimension(60,60));
        eightButton.setFont(eightButton.getFont().deriveFont(32.0f));
        eightButton.setHorizontalAlignment(SwingConstants.CENTER);
        eightButton.setBackground(ButtonColor);
        eightButton.addActionListener(new ButtonClick(this));
        eightButton.setActionCommand("eightButton");

        nineButton = new JButton("9");
        nineButton.setSize(60,60);
        nineButton.setMinimumSize(new Dimension(60,60));
        nineButton.setFont(nineButton.getFont().deriveFont(32.0f));
        nineButton.setHorizontalAlignment(SwingConstants.CENTER);
        nineButton.setBackground(ButtonColor);
        nineButton.addActionListener(new ButtonClick(this));
        nineButton.setActionCommand("nineButton");

        zeroButton = new JButton("0");
        zeroButton.setSize(60,60);
        zeroButton.setMinimumSize(new Dimension(60,60));
        zeroButton.setFont(zeroButton.getFont().deriveFont(32.0f));
        zeroButton.setHorizontalAlignment(SwingConstants.CENTER);
        zeroButton.setBackground(ButtonColor);
        zeroButton.addActionListener(new ButtonClick(this));
        zeroButton.setActionCommand("zeroButton");

        plusButton = new JButton("+");
        plusButton.setSize(60,60);
        plusButton.setMinimumSize(new Dimension(60,60));
        plusButton.setFont(plusButton.getFont().deriveFont(32.0f));
        plusButton.setHorizontalAlignment(SwingConstants.CENTER);
        plusButton.setBackground(ButtonColor);
        plusButton.addActionListener(new ButtonClick(this));
        plusButton.setActionCommand("plusButton");

        minusButton = new JButton("-");
        minusButton.setSize(60,60);
        minusButton.setMinimumSize(new Dimension(60,60));
        minusButton.setFont(minusButton.getFont().deriveFont(32.0f));
        minusButton.setHorizontalAlignment(SwingConstants.CENTER);
        minusButton.setBackground(ButtonColor);
        minusButton.addActionListener(new ButtonClick(this));
        minusButton.setActionCommand("minusButton");

        equalButton = new JButton("  =  ");
        equalButton.setFont(equalButton.getFont().deriveFont(32.0f));
        equalButton.setMinimumSize(new Dimension(120,60));
        equalButton.setHorizontalAlignment(SwingConstants.CENTER);
        equalButton.setBackground(ButtonColor);
        equalButton.addActionListener(new ButtonClick(this));
        equalButton.setActionCommand("equalButton");

        dividerButton = new JButton("/");
        dividerButton.setSize(60,60);
        dividerButton.setMinimumSize(new Dimension(60,60));
        dividerButton.setFont(dividerButton.getFont().deriveFont(32.0f));
        dividerButton.setHorizontalAlignment(SwingConstants.CENTER);
        dividerButton.setBackground(ButtonColor);
        dividerButton.addActionListener(new ButtonClick(this));
        dividerButton.setActionCommand("dividerButton");

        multiplicationButton = new JButton("*");
        multiplicationButton.setSize(60,60);
        multiplicationButton.setMinimumSize(new Dimension(60,60));
        multiplicationButton.setFont(multiplicationButton.getFont().deriveFont(32.0f));
        multiplicationButton.setHorizontalAlignment(SwingConstants.CENTER);
        multiplicationButton.setBackground(ButtonColor);
        multiplicationButton.addActionListener(new ButtonClick(this));
        multiplicationButton.setActionCommand("multiplicationButton");

        rightbracketsButton = new JButton("(");
        rightbracketsButton.setSize(60,60);
        rightbracketsButton.setMinimumSize(new Dimension(60,60));
        rightbracketsButton.setFont(rightbracketsButton.getFont().deriveFont(16.0f));
        rightbracketsButton.setBackground(ButtonColor);
        rightbracketsButton.addActionListener(new ButtonClick(this));
        rightbracketsButton.setActionCommand("rightbracketsButton");

        leftbracketsButton = new JButton(")");
        leftbracketsButton.setSize(60,60);
        leftbracketsButton.setMinimumSize(new Dimension(60,60));
        leftbracketsButton.setFont(leftbracketsButton.getFont().deriveFont(16.0f));
        leftbracketsButton.setBackground(ButtonColor);
        leftbracketsButton.addActionListener(new ButtonClick(this));
        leftbracketsButton.setActionCommand("leftbracketsButton");

        enterButton = new JButton("ENTER");
        enterButton.setMinimumSize(new Dimension(120,60));
        enterButton.setFont(enterButton.getFont().deriveFont(26.5f));
        enterButton.setBackground(ButtonColor);
        enterButton.addActionListener(new ButtonClick(this));
        enterButton.setActionCommand("enterButton");

        Delete = new JButton("DELETE");
        Delete.setMinimumSize(new Dimension(120,60));
        Delete.setFont(enterButton.getFont().deriveFont(26.5f));
        Delete.setBackground(ButtonColor);
        Delete.addActionListener(new ButtonClick(this));
        Delete.setActionCommand("Delete");

        powerButton = new JButton("^");
        powerButton.setSize(60,60);
        powerButton.setMinimumSize(new Dimension(60,60));
        powerButton.setFont(powerButton.getFont().deriveFont(32.0f));
        powerButton.setBackground(ButtonColor);
        powerButton.addActionListener(new ButtonClick(this));
        powerButton.setActionCommand("powerButton");

        squareButton = new JButton("v");
        squareButton.setSize(60,60);
        squareButton.setMinimumSize(new Dimension(60,60));
        squareButton.setFont(squareButton.getFont().deriveFont(32.0f));
        squareButton.setBackground(ButtonColor);
        squareButton.addActionListener(new ButtonClick(this));
        squareButton.setActionCommand("squareButton");

        moduloButton = new JButton("%");
        moduloButton.setSize(60,60);
        moduloButton.setMinimumSize(new Dimension(60,60));
        moduloButton.setFont(moduloButton.getFont().deriveFont(32.0f));
        moduloButton.setBackground(ButtonColor);
        moduloButton.addActionListener(new ButtonClick(this));
        moduloButton.setActionCommand("moduloButton");

        strongButton = new JButton("!");
        strongButton.setSize(60,60);
        strongButton.setMinimumSize(new Dimension(60,60));
        strongButton.setFont(strongButton.getFont().deriveFont(32.0f));
        strongButton.setBackground(ButtonColor);
        strongButton.addActionListener(new ButtonClick(this));
        strongButton.setActionCommand("strongButton");
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
