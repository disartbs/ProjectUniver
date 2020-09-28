package com.company.geometry;

public class Segment {
    Point p1, p2;

    Segment() {
        p1 = new Point();
        p2 = new Point();
    }

    Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    Segment(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    double length() {
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
