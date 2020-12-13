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
//
//        JLabel label = new JLabel("<html>QQQQQ:<br> What<br>ffffffffff");
//        label.setFont(new FontUIResource("Serif", Font.BOLD, 15));
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        getContentPane().add(label);
//
//        JButton button = new JButton("Кноппка");
//        button.setMargin(new Insets(100,100,20,30));
//        button.setVerticalTextPosition(SwingConstants.TOP);
//        button.setHorizontalTextPosition(SwingConstants.LEFT);
//        getContentPane().add(button, "East");
//        pack();
//        getContentPane().add(label, BorderLayout.SOUTH);
//        JLabel label1 = new JLabel("BBBBBBBBBBBBBBBBB");
//        getContentPane().add(label1, BorderLayout.CENTER);
//        JLabel label2 = new JLabel("CCCCCCCCC");
//        getContentPane().add(label2, BorderLayout.EAST);
//        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
//        getContentPane().add(new JButton("Шкиола"));
//        getContentPane().add(new JButton("Cflbtr"));
//        getContentPane().add(new JButton("Frfltv"));
//        JLabel a = new JLabel("DDDDDD");
//        JButton b = new JButton("!111");
//        JButton b1 = new JButton("!222");
//        JButton b2 = new JButton("!333");
        //  JPanel panel = new JPanel();
//        panel.add(b);
//        panel.add(b1);
//        panel.add(b2);
//        panel.add(a);
//        panel.setBackground(Color.MAGENTA);
//        add(panel, BorderLayout.CENTER);

//        GridLayout layout = new GridLayout(2,0,5,12);
//        panel.setLayout(layout);
//        for (int i = 0; i < 8; i++) {
//            panel.add(new JButton("Knopca "+ i));
//        }
//        getContentPane().add(panel);

//        JPanel grid = new JPanel(new GridLayout(1,2,5,0));
//        grid.add(new JButton("OK"));
//        grid.add(new JButton("Otmena"));
//        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//        flow.add(grid);
//        getContentPane().add(flow, BorderLayout.SOUTH);
//
//        JPanel box = new JPanel();
//        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
//        box.add(new JButton("Button 1"));
//        box.add(new JButton("Button 2"));
//        JButton button3 = new JButton("Button 3");
//        button3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
//        box.add(button3);
//        getContentPane().add(box);

//        Box box = Box.createVerticalBox();
//        box.add(new JButton("Button"));
//        box.add(Box.createVerticalStrut(10));
//        box.add(new JButton("+"));
//        box.add(Box.createVerticalGlue());
//        //После него все прикреплено ко дну
//        box.add(new JButton("-"));
//        box.add(new JButton("looooooooong button"));
//        setContentPane(box);

        //Toggle - только одна может быть нажата,
        // когда они сгруппированы

//        Box mainBox = Box.createVerticalBox();
//
//        Box box1 = Box.createVerticalBox();
//        JToggleButton toggleButton1 = new JToggleButton("Toggle 1");
//        JToggleButton toggleButton2 = new JToggleButton("Toggle 2");
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(toggleButton1);
//        buttonGroup.add(toggleButton2);
//        box1.add(toggleButton1);
//        box1.add(toggleButton2);
//        box1.setBorder(new TitledBorder("Toggles"));
//
//        Box box2 = Box.createVerticalBox();
//        JCheckBox checkBox1 = new JCheckBox("Check 1");
//        JCheckBox checkBox2 = new JCheckBox("Check 2");
//        box2.add(checkBox1);
//        box2.add(checkBox2);
//        box2.setBorder(new TitledBorder("Checks"));
//
//        Box box3 = Box.createVerticalBox();
//        JRadioButton radioButton1 = new JRadioButton("Radio 1");
//        JRadioButton radioButton2 = new JRadioButton("Radio 2");
//        buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        box3.add(radioButton1);
//        box3.add(radioButton2);
//        box3.setBorder(new TitledBorder("Radios"));
//
//        mainBox.add(box1);
//        mainBox.add(box2);
//        mainBox.add(box3);
//        setContentPane(mainBox);

//        //если нет менедженра резмещений, то можно в ручную
//        JPanel panel = new JPanel();
//        panel.setLayout(null);
//        JButton button = new JButton("Button");
//        button.setSize(80,20);
//        button.setLocation(20,20);
//        panel.add(button);
//        button = new JButton("Loooooong button");
//        button.setSize(120,40);
//        button.setLocation(70,50);
//        panel.add(button);
//        setContentPane(panel);


//        JTextField textField = new JTextField("Text field", 20);
//        textField.setCaretColor(Color.CYAN);
//        textField.setHorizontalAlignment(JTextField.RIGHT);
//
//        JPasswordField passwordField = new JPasswordField(20);
//        passwordField.setEchoChar('#');
//        passwordField.setText("12345");
//
//        JTextArea textArea = new JTextArea(5,20);
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);
//
//        for (int i = 0; i < 21; i++) {
//            textArea.append("Тееееееееееееееекст ооооооооооообласть");
//        }
//
//        getContentPane().add(textField, BorderLayout.NORTH);
//        getContentPane().add(textArea);
//        getContentPane().add(passwordField, BorderLayout.SOUTH);
//
//        pack();


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1 was pressed");
        panel.add(button1);
//        JButton button2 = new JButton("Button 2");
//        button1.setActionCommand("Button 2 was pressed");
//        panel.add(button2);
//        JButton button3 = new JButton("Button 3");
//        button3.setActionCommand("Button 3 was pressed");
//        panel.add(button3);

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
