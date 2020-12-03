package com.company.geometry;

public class Triangle {
    Point p1, p2, p3;

    Triangle() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1.newInstance();
        this.p2 = p2.newInstance();
        this.p3 = p3.newInstance();
    }

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
    }

    double area() {
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - p1.distance(p2)) * (semiPerimeter - p2.distance(p3)) * (semiPerimeter - p3.distance(p1)));
    }

    double perimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String toString() {
        return "Triangle " + "p1 = " + p1 + ", p2 = " + p2 + ", p3 = " + p3 + "\n" + "Perimeter = " + perimeter() + " Area = " + area();
    }
}
