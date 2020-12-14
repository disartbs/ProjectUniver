package com.company.window.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow extends JFrame {

    private final JTextField textField;
    private final JTextField textField1;
    private final JTextField textField2;

    SimpleWindow() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 800);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1 was pressed");
        panel.add(button1);

        textField1 = new JTextField();
        textField1.setColumns(6);
        panel.add(textField1);
        textField2 = new JTextField();
        textField2.setColumns(6);
        panel.add(textField2);

        textField = new JTextField();
        textField.setColumns(23);
        panel.add(textField);

        ActionListener actionListener = new TestActionListener();
        button1.addActionListener(actionListener);
//        button2.addActionListener(actionListener);
//        button3.addActionListener(actionListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
        //По умолчанию размер
    }

    private class TestActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(String.valueOf(Integer.parseInt(textField1.getText()) +
                    Integer.parseInt(textField2.getText())));
            System.out.println(e.getActionCommand());
        }
    }
}
