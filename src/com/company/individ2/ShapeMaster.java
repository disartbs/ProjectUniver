package com.company.individ2;

import com.company.individ2.models.Point;
import com.company.individ2.models.Shape;
import com.company.individ2.models.Triangle;

public class ShapeMaster<T1 extends Shape,T2 extends Shape> {

    boolean isPointIncludeT1(Point point, T1 t1){
        boolean result = false;
        Point[] p = t1.getPoints();
        int j = p.length - 1;
        for (int i = 0; i < p.length; i++) {
            if ( (p[i].Y <=/*Для строгого включения*/ point.Y && p[j].Y >= point.Y ||
                    p[j].Y <=/*Для строгого включения*/ point.Y && p[i].Y >= point.Y) &&
                    (p[i].X + (point.Y - p[i].Y) / (p[j].Y - p[i].Y) * (p[j].X - p[i].X) <=/*Для строгого включения*/ point.X) )
                result = !result;
            j = i;
        }
        return result;
    }

    /**
     * @param t1
     * @param t2
     * is t2 include t1
     */
    public boolean isInclude(T1 t1, T2 t2){
        Point[] points2 = t2.getPoints();
        boolean result = true;
        for (Point point : points2) {
           result = result && isPointIncludeT1(point, t1);
           System.out.println("" + point + " " + isPointIncludeT1(point,t1));
        }
        return result;
    }
}
