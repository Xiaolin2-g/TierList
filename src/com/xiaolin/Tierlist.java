package com.xiaolin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Tierlist implements ActionListener, WindowStateListener {


    JFrame frame;
    JPanel panel;


    public Tierlist(){
        initFrame();
        initPanel();
        finishFrame();
    }


    private void initFrame() {
        frame = new JFrame("Tier List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    private void initPanel() {
        panel = new JPanel();
        panel.setBounds(frame.getBounds());
        panel.setBackground(Color.BLACK);
    }

    private void finishFrame() {
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void windowStateChanged(WindowEvent e) {

    }

}
