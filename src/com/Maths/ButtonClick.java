package com.Maths;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClick implements ActionListener {

    ButtonPanel bt;

    public ButtonClick(ButtonPanel bt){
        this.bt = bt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        System.out.println("I am working!");
        Buttons button = Buttons.valueOf(e.getActionCommand());
        String stringText = bt.getWindowWithnote();

        switch (button){
            case oneButton     :
                stringText+="1";
                break;
            case twoButton     :
                stringText+="2";
                break;
            case threeButton     :
                stringText+="3";
                break;
            case fourButton     :
                stringText+="4";
                break;
            case fiveButton     :
                stringText+="5";
                break;
            case sixButton     :
                stringText+="6";
                break;
            case sevenButton     :
                stringText+="7";
                break;
            case eightButton     :
                stringText+="8";
                break;
            case nineButton     :
                stringText+="9";
                break;
            case zeroButton     :
                stringText+="0";
                break;
            case plusButton     :
                stringText+="+";
                break;
            case minusButton     :
                stringText+="-";
                break;
            case equalButton     :
                stringText+="=";
                break;
            case dividerButton     :
                stringText+="/";
                break;
            case multiplicationButton     :
                stringText+="*";
                break;
            case rightbracketsButton     :
                stringText+="(";
                break;
            case leftbracketsButton     :
                stringText+=")";
                break;
            case powerButton     :
                stringText+="^";
                break;
            case moduloButton     :
                stringText+="%";
                break;
            case squareButton     :
                stringText+="v";
                break;
            case strongButton     :
                stringText+="!";
                break;
            case Delete:
                stringText="";
                bt.setWindowWithResult("");
                break;
            case enterButton     :
                String ONP = bt.getWindowWithnote();
                System.out.println(ONP);
                MagicFormula mg = new MagicFormula();

                String wyjscie;
                try{
                    Double wyn =  mg.MagicEquationOne(ONP);
                    wyjscie = wyn.toString();
                } catch(Exception ex){
                    wyjscie = "Blad";
                }

                bt.setWindowWithResult(wyjscie);
                break;
        }

        bt.setWindowWithnote(stringText);


    }

}

