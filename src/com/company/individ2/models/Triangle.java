package com.company.individ2.models;

import java.util.Objects;

public class Triangle implements Shape {
    Point p1, p2, p3;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1.newInstance();
        this.p2 = p2.newInstance();
        this.p3 = p3.newInstance();
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
    }

    public Point[] getPoints() {
        return new Point[]{p1, p2, p3};
    }

    @Override
    public void move(int x, int y) {
        p1.move(x, y);
        p2.move(x, y);
        p3.move(x, y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2, p3);
    }
}
