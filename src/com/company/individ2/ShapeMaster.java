package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Shape;

public class ShapeMaster<T1 extends Shape, T2 extends Shape> {

    boolean isPointIncludeT1(Point point, T1 t1) {
        boolean result = false;
        int trueCount = 0;
        System.out.println("Checking " + point);
        Point[] p = t1.getPoints();
        int j = p.length - 1;
        for (int i = 0; i < p.length; i++) {
            /*Для строгого включения убрать =*/
            if (((p[i].getX() > p[j].getX() && p[i].getY() > p[j].getY()) || (p[i].getX() < p[j].getX() && p[i].getY() < p[j].getY())))

                if (
//                    ((point.getY() >= p[i].getY() && point.getY() <= p[j].getY()) ||
//                    (p[j].getY() <=/*Для строгого включения*/ point.getY() && point.getY() <= p[i].getY())) &&
                        (p[i].getX() + (point.getY() - p[i].getY()) / (p[j].getY() - p[i].getY()) *
                                (p[j].getX() - p[i].getX()) <=/*Для строгого включения*/ point.getX())) {
                    //System.out.println("in if " +!result);
                    trueCount++;
                    System.out.println("<= true");
                    //result = !result;
                } else if ((p[i].getX() + (point.getY() - p[i].getY()) / (p[j].getY() - p[i].getY()) *
                        (p[j].getX() - p[i].getX()) >=/*Для строгого включения*/ point.getX())) {
                    trueCount++;
                    System.out.println(">= true");
                    // result = !result;
                }
//            System.out.println((p[i].getY() <=/*Для строгого включения убрать =*/ point.getY() && point.getY() <= p[j].getY()));
//            System.out.println((p[j].getY() <=/*Для строгого включения*/ point.getY() && point.getY() <= p[i].getY()));
            System.out.println("in for " + "i=" + i + " j=" + j);
            System.out.println((p[i].getX() + (point.getY() - p[i].getY()) / (p[j].getY() - p[i].getY()) *
                    (p[j].getX() - p[i].getX()) <=/*Для строгого включения*/ point.getX()));
            j = i;
        }
        if (trueCount == p.length)
            return true;
        return result;
    }

    public boolean rayTracing(Point point, T1 t1) {
        int trueCount = 0;
        Point p0 = new Point(Math.random() * 10000, Math.random() * 10000);
        Point[] p = t1.getPoints();
        int j = p.length - 1;
        for (int i = 0; i < p.length; i++) {
            if (isIntersection(p[i], p[j], point, p0)) {
                trueCount++;
            }
            j = i;
        }
//        System.out.println(point);
//        System.out.println(trueCount);
//        System.out.println((trueCount & 1) == 1);
        return (trueCount & 1) == 1;
    }

    boolean isIntersection(Point p1, Point p2, Point p3, Point p4) {
        boolean result;
        double det1;
        double u;
        double det;
        double v;
        double det2;
        double a1 = p1.getX() - p2.getX();
        double a2 = p4.getX() - p3.getX();
        double a0 = p4.getX() - p2.getX();
        double b1 = p1.getY() - p2.getY();
        double b2 = p4.getY() - p3.getY();
        double b0 = p4.getY() - p2.getY();
        double c1 = p1.getX() * p2.getY() - p2.getX() * p1.getY();
        double c2 = p3.getX() * p4.getY() - p4.getX() * p3.getY();
        det = b2 * a1 - a2 * b1;
        if (det == 0) { // || или совпадают
            if (c1 * a2 - c2 * a1 == 0 //Проверка вложенности отрезков друг в друга. Из уравнений отрезков
                    && c1 * b2 - c2 * b1 == 0) {
                result = true;
                //System.out.print("Отрезки пересекаются");
            } else {
                result = false;
                //System.out.print("Отрезки не пересекаются");
            }
        } else {
            det1 = a0 * b2 - a2 * b0;
            det2 = a1 * b0 - a0 * b1;
            u = det1 / det;
            v = det2 / det;
            if (u > 0 && u < 1 && v > 0 && v < 1) {
                result = true;
                //System.out.print("Отрезки пересекаются");
            } else {
                result = false;
                //System.out.print("Отрезки не пересекаются");
            }
        }
//        System.out.println(result);
//
//        System.out.println(" " + p1 + p2 + p3 + p4);
        return result;
    }


    /**
     * @param t1
     * @param t2 is t2 include t1
     */
    public boolean isInclude(T1 t1, T2 t2) {
        Point[] points2 = t2.getPoints();
        boolean result = true;
        for (Point point : points2) {
            result = result && rayTracing(point, t1);
        }
        return result;
    }

    public void move(Shape shape) {
        shape.move(1, 1);
    }
}
