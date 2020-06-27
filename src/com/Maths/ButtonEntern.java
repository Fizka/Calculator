package com.Maths;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEntern implements ActionListener {

    ButtonPanel bt;

    public ButtonEntern(ButtonPanel bt){
        this.bt = bt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        String ONP = bt.getWindowWithnote();
        System.out.println(ONP);
        String wyjscie = "wynik";
        //zrobienie ONP

        bt.setWindowWithResult(wyjscie);


    }
}
