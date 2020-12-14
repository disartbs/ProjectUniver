package com.company.window.view;

import com.company.window.Presenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutputFrame extends JFrame {

    JTextField resultTF;
    Presenter presenter;

    public OutputFrame() {
        super("Output");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        initTF(panel);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    private void initTF(JPanel panel) {
        resultTF = new JTextField(30);
        panel.add(resultTF);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setResult(String result){
        resultTF.setText(result);
    }
}
