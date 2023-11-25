package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;

    public Sphere(String shape, double radius) {
        super(shape);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}
