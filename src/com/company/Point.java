package com.company;

public class Point {
    double x,y;

    Point(){
        x = 0;
        y = 0;
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
