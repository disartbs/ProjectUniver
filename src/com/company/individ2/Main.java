package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Tetragon;
import com.company.individ2.models.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(0,0,4,0,2,4);
        Tetragon tetragon = new Tetragon(1,0,2,0,1,1,2,2);
        ShapeMaster<Triangle> triangleShapeMaster = new ShapeMaster<>(triangle);
        System.out.println(triangleShapeMaster.isInclude(tetragon));

        ShapeMaster<Tetragon> tetragonShapeMaster = new ShapeMaster<>(tetragon);
        System.out.println(tetragonShapeMaster.isInclude(triangle));

        triangleShapeMaster.move(1,1);
        System.out.println(triangleShapeMaster.isInclude(tetragon));
        System.out.println(tetragonShapeMaster.isInclude(triangle));

    }
}
