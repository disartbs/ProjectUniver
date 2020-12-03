package com.company.individ2.models;

public class Point {
    public double X, Y;

    public Point() {
        X = 0;
        Y = 0;
    }

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        this.X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        this.Y = y;
    }

    public Point newInstance() {
        return new Point(this.X, this.Y);
    }

    @Override
    public String toString() {
        return "(" + X + "," + Y + ')';
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.X - this.X, 2) + Math.pow(p2.Y - this.Y, 2));
    }
}
