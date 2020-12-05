package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Shape;
import com.company.individ2.models.Triangle;

public class ShapeMaster<T extends Shape> {

    private T t;
    public ShapeMaster(T shape) {
        this.t = shape;
    }

    boolean isPointIncludeT1(Point point){
        boolean result = false;
        Point[] p = t.getPoints();
        int j = p.length - 1;
        for (int i = 0; i < p.length; i++) {
            if ( (p[i].getY() <=/*Для строгого включения*/ point.getY() && p[j].getY() >= point.getY() ||
                    p[j].getY() <=/*Для строгого включения*/ point.getY() && p[i].getY() >= point.getY()) &&
                    (p[i].getX() + (point.getY() - p[i].getY()) /
                            (p[j].getY() - p[i].getY()) *
                            (p[j].getX() - p[i].getX()) <=/*Для строгого включения*/ point.getX()) )
                result = !result;
            j = i;
        }
        return result;
    }

    public boolean isInclude(Shape shape){
        Point[] points = shape.getPoints();
        boolean result = true;
        for (Point point : points) {
           result = result && isPointIncludeT1(point);
           System.out.println("" + point + " " + isPointIncludeT1(point));
        }
        return result;
    }

    public void move(int x, int y){
        Point[] points = t.getPoints();
        for (Point point : points) {
            point.move(x,y);
        }
    }
}
