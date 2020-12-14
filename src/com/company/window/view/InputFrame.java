package com.company.window.view;

import com.company.window.Presenter;

import javax.swing.*;
import java.awt.*;

public class InputFrame extends JFrame {

    JTextField numberTF;
    JTextField countOfCompartmentsTF;
    JTextField cityTF;
    JButton initTrainBtn;
    JButton addCityBtn;
    JButton newTrain;
    JButton resultBnt;

    Presenter presenter;

    public InputFrame() {
        super("Input");
        setSize(300, 300);
        JPanel panel = new JPanel(new FlowLayout());

        initTF(panel);

        initBnt(panel);

        initTrainBtn.addActionListener(e -> {
            presenter.initTrain(Integer.parseInt(numberTF.getText()), Integer.parseInt(countOfCompartmentsTF.getText()));
        });
        addCityBtn.addActionListener(e -> {
            presenter.addCity(cityTF.getText());
            cityTF.setText("");
        });
        newTrain.addActionListener(e -> {
            presenter.newTrain();
            numberTF.setText("");
            countOfCompartmentsTF.setText("");
            cityTF.setText("");
        });
        resultBnt.addActionListener(e -> {
            presenter.result();
        });

        getContentPane().add(panel);
    }

    private void initBnt(JPanel panel) {
        addCityBtn = new JButton("Add City");
        initTrainBtn = new JButton("Init Train");
        newTrain = new JButton("New Train");
        resultBnt = new JButton("Result");
        panel.add(initTrainBtn);
        panel.add(addCityBtn);
        panel.add(newTrain);
        panel.add(resultBnt);
    }

    private void initTF(JPanel panel) {
        numberTF = new JTextField(6);
        countOfCompartmentsTF = new JTextField(6);
        cityTF = new JTextField(6);
        panel.add(numberTF);
        panel.add(countOfCompartmentsTF);
        panel.add(cityTF);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public String getText1() {
        return numberTF.getText();
    }

    public String getText2() {
        return countOfCompartmentsTF.getText();
    }
}
