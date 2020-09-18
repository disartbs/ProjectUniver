package com.company.geometry;

public class Point {
    private double x,y;

    Point(){
        x = 0;
        y = 0;
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

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    Point newInstance(){
        return new Point(this.x, this.y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }

    double distance(Point p2){
        return Math.sqrt(Math.pow(p2.x - this.x,2) + Math.pow(p2.y - this.y,2));
    }
}
