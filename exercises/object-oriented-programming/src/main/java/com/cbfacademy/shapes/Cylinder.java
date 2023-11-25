package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(String shape, double radius, double height) {
        super(shape);  // Pass the shape's name to the super constructor
        this.radius = radius;
        this.height = height;
    }
    

    @Override
    public double getArea() {
        return height * Math.PI * (radius * radius);
    }
}
