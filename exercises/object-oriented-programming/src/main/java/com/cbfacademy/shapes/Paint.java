package com.cbfacademy.shapes;

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double getAmount(Shape shape) {
        double area = shape.getArea();
        return area / coverage;
    }
}
