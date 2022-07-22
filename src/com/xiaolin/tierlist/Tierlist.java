package com.xiaolin.tierlist;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tierlist implements ActionListener {


    JFrame frame;
    JPanel background;
    JPanel panel;

    JButton addNewTierButton;
    JButton removeTierButton;

    public Tierlist(){
        initFrame();
    }

    private void initFrame() {
        frame = new JFrame("Tier List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        initBackground();
        initPanel();


        frame.add(panel);
        frame.add(background, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    private void initBackground() {
        background = new JPanel();
        background.setBounds(frame.getBounds());
        background.setBackground(Color.BLACK);
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setBounds(0, 0, 100, 50);
        panel.setLayout(new GridLayout(1,2));
        panel.setBackground(Color.GREEN);

        initButtons();

        panel.add(addNewTierButton);
        panel.add(removeTierButton);
    }


    private JButton initButton(String text, Color backgroundColor){
        JButton button = new JButton(text);
        button.setBackground(backgroundColor);
        button.addActionListener(this);
        button.setFocusable(false);

        return button;
    }

    private void initButtons(){
        addNewTierButton = initButton("+", Color.GREEN);
        removeTierButton = initButton("-", Color.RED);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
