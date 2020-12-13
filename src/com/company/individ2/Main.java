package com.company.individ2;

import com.company.individ2.models.Tetragon;
import com.company.individ2.models.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(0, 0, 4, 0, 2, 4);
        Tetragon tetragon = new Tetragon(0, 0, 2, 0, 1, 1, 2, 2);
        ShapeMaster<Triangle> triangleShapeMaster = new ShapeMaster<>(triangle);
        System.out.println("Треугольник включает четырехугольник? " + triangleShapeMaster.isInclude(tetragon));

        ShapeMaster<Tetragon> tetragonShapeMaster = new ShapeMaster<>(tetragon);
        System.out.println("Четырехугольник включает треугольник?" + tetragonShapeMaster.isInclude(triangle));

        triangleShapeMaster.move(1, 1);
        System.out.println("Сдвиг треугольника на 1 по каждой координате");
        System.out.println("Треугольник включает четырехугольник? " + triangleShapeMaster.isInclude(tetragon));
        System.out.println("Четырехугольник включает треугольник?" + tetragonShapeMaster.isInclude(triangle));

    }
}
