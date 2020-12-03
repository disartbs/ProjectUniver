package com.company.individ2.models;

public class Point {
    private double x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x +=x;
        this.y +=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point newInstance() {
        return new Point(this.x, this.y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
    }
}
