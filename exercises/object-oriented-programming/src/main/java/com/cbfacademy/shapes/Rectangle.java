package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String shape, double length, double width) {
        super(shape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width ;
    }
    
}
