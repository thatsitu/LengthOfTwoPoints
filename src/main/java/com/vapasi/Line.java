package com.vapasi;

import java.util.Objects;

public class Line {
    private Point A;
    private Point B;


    @Override
    public boolean equals(Object that) {
        if (this== that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Line line = (Line) that;
        if(this.A.equals(this.B)) return true;
        return Objects.equals(A, line.A) &&
                Objects.equals(B, line.B);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B);
    }

}
