package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Tetragon;
import com.company.individ2.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 1);
        Point p4 = new Point(1, 0);
        Point p3 = new Point(0, 0);
        Triangle triangle = new Triangle(0,-1,1,4,4,0);
        Tetragon tetragon = new Tetragon(1, 0, 2, 0, 1, 1, 2, 2);
        ShapeMaster<Triangle, Tetragon> shapeMaster = new ShapeMaster<>();
        System.out.println("Треугольник включает четырехугольник? " + shapeMaster.isInclude(triangle, tetragon));
        shapeMaster.move(triangle);
        System.out.println("Сдвиг треугольника на 1 по каждой координате");
        System.out.println("Треугольник включает четырехугольник? " + shapeMaster.isInclude(triangle, tetragon));
       // isIntersection(p1, p2, p3, p4);
    }

private static void isIntersection(Point p1, Point p2, Point p3, Point p4) {
    double det1;
    double u;
    double det;
    double v;
    double det2;
    double a1 = p1.getX() - p2.getX();
    double a2 = p4.getX() - p3.getX();
    double a0 = p4.getX() - p2.getX();
    double b1 = p1.getY() - p2.getY();
    double b2 = p4.getY() - p3.getY();
    double b0 = p4.getY() - p2.getY();
    double c1 = p1.getX()* p2.getY() - p2.getX() * p1.getY();
    double c2 = p3.getX()* p4.getY() - p4.getX() * p3.getY();
    det = b2 * a1 - a2 * b1;
    if (det == 0) { // || или совпадают
        if (c1 * a2 - c2 * a1 == 0 //Проверка вложенности отрезков друг в друга. Из уравнений отрезков
                && c1 * b2 - c2 * b1 == 0){
            System.out.print("Отрезки пересекаются");
        }
        else System.out.print("Отрезки не пересекаются");
    } else {
        det1 = a0 * b2 - a2 * b0;
        det2 = a1 * b0 - a0 * b1;
        u = det1 / det;
        v = det2 / det;
        System.out.println("det != 0");
        System.out.println(u + " " + v);
        if (u >= 0 && u <= 1 && v >= 0 && v <= 1) System.out.print("Отрезки пересекаются");
        else System.out.print("Отрезки не пересекаются");
    }
}
}

