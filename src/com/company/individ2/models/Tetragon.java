package com.company.individ2.models;

import java.util.Objects;

public class Tetragon extends Figure implements Shape {

    public Tetragon(Point p1, Point p2, Point p3, Point p4) {

        super(4);
        points[0] = p1.newInstance();
        points[1] = p2.newInstance();
        points[2] = p3.newInstance();
        points[3] = p3.newInstance();

    }

    public Tetragon(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(4);
        points[0] = new Point(x1, y1);
        points[1] = new Point(x2, y2);
        points[2] = new Point(x3, y3);
        points[3] = new Point(x4, y4);
    }

    @Override
    public Point[] getPoints() {
        return points;
    }

    @Override
    public void move(int x, int y) {
        for (Point point : points) {
            point.move(x, y);
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
