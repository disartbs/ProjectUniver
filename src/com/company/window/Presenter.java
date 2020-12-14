package com.company.window;

import com.company.window.view.InputFrame;
import com.company.window.view.OutputFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Presenter {
    InputFrame input;
    OutputFrame output;
    ArrayList<CrazyTrain> trains;
    ArrayList<String> cities;
    CrazyTrain currentTrain;

    Presenter() {
        trains = new ArrayList<>();
        cities = new ArrayList<>();
    }

    public String calculate() {
        return String.valueOf(Integer.parseInt(input.getText1()) +
                Integer.parseInt(input.getText2()));
    }

    public void setInput(InputFrame input) {
        this.input = input;
        input.setPresenter(this);
    }

    public void setOutput(OutputFrame output) {
        this.output = output;
        output.setPresenter(this);
    }

    public void initTrain(int nubmer, int count) {
        System.out.println(currentTrain);
        if (currentTrain == null){
            currentTrain = new CrazyTrain(nubmer, count);
            trains.add(currentTrain);
        }
        else {
            currentTrain.setNumber(nubmer);
            currentTrain.setCountOfCompartments(count);
        }
    }

    public void addCity(String city) {
        currentTrain.addCity(city);
        if (!cities.contains(city))
            cities.add(city);
    }

    public void newTrain() {
        currentTrain = new CrazyTrain();
    }

    public void result() {
        output.setVisible(true);
        output.setResult(getResult(1));
    }

    private String getResult(int n) {
        TreeMap<String, Integer> mp = new TreeMap<>();
        Iterator<String> citiesIter = cities.iterator();
        String city;
        int k;
        while (citiesIter.hasNext()) {
            city = citiesIter.next();
            k = 0;
            mp.put(city, countStops(city));
        }
        System.out.println(mp);
        Iterator<Map.Entry<String, Integer>> mpIter = mp.entrySet().iterator();
        ArrayList<String> list = new ArrayList<>();
        while(mpIter.hasNext()){
            Map.Entry<String, Integer> entry = mpIter.next();
            if(entry.getValue() == n)
                list.add(entry.getKey());
        }
        return list.toString();
    }

    private int countStops(String city) {
        Iterator<CrazyTrain> trainIterator = trains.iterator();
        int k = 0;
        while (trainIterator.hasNext()) {
            if (trainIterator.next().isStopInCity(city))
                k++;
        }
        return k;
    }
}
