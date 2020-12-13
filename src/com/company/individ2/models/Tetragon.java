package com.company.individ2.models;

import java.util.Objects;

public class Tetragon implements Shape {
    Point p1, p2, p3, p4;

    public Tetragon(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1.newInstance();
        this.p2 = p2.newInstance();
        this.p3 = p3.newInstance();
        this.p4 = p4.newInstance();
    }

    public Tetragon(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{p1, p2, p3, p4};
    }


    @Override
    public int hashCode() {
        return Objects.hash(p1, p2, p3, p4);
    }
}
