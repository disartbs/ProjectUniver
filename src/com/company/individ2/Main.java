package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Tetragon;
import com.company.individ2.models.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(0,0,4,0,2,4);
        Tetragon tetragon = new Tetragon(1,0,2,0,1,1,2,2);
        ShapeMaster<Triangle, Tetragon> shapeMaster = new ShapeMaster<>();


        System.out.println("Треугольник включает четырехугольник? " + shapeMaster.isInclude(triangle, tetragon));

        shapeMaster.move(triangle);
        System.out.println("Сдвиг треугольника на 1 по каждой координате");
        System.out.println("Треугольник включает четырехугольник? " + shapeMaster.isInclude(triangle, tetragon));

    }
}
