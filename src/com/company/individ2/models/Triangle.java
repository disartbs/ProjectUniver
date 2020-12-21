package com.company.individ2.models;

import java.util.Objects;

public class Triangle extends Figure implements Shape {

    Triangle(Point p1, Point p2, Point p3) {
        super(3);
        points[0] = p1.newInstance();
        points[1] = p2.newInstance();
        points[2]= p3.newInstance();
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(3);
        points[0] = new Point(x1, y1);
        points[1] = new Point(x2, y2);
        points[2] = new Point(x3, y3);
    }

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
