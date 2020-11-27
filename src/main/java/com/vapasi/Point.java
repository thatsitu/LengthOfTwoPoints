package com.vapasi;

import java.util.Objects;

public class Point {
    private final double x1;
    private final double x2;



    public Point(double x1,double x2) {
        this.x1 =x1;
        this.x2 = x2;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != o.getClass()) return false;
        Point point = (Point) that;
        if(this.x1 == that.x1)
        return Double.compare(point.x1, x1) == 0 &&
                Double.compare(point.x2, x2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2);
    }

    public double distance(Point p2) {
        double distance =Math.sqrt((this.x2-this.x1)*(this.x2-this.x1) + (p2.x2- p2.x1)*(p2.x2-p2.x1));
        return(Math.round(distance*100.0)/100.0);

    }
}
