package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Tetragon;
import com.company.individ2.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0,0);
        Triangle triangle = new Triangle(0,0,4,0,2,4);
        Tetragon tetragon = new Tetragon(1,0,2,0,1,1,2,2);
        ShapeMaster<Triangle, Tetragon> shapeMaster = new ShapeMaster<>();
        System.out.println(shapeMaster.isInclude(triangle,tetragon));
    }
}