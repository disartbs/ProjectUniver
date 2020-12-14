package com.company.window;

import com.company.window.view.InputFrame;
import com.company.window.view.OutputFrame;

public class Main {
    public static void main(String[] args) {
        OutputFrame outputFrame = new OutputFrame();
        InputFrame inputFrame = new InputFrame();
        Presenter presenter = new Presenter();
        presenter.setInput(inputFrame);
        presenter.setOutput(outputFrame);
        //outputFrame.setVisible(true);
        inputFrame.setVisible(true);
    }
}
