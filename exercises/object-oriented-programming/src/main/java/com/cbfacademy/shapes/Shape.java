package com.cbfacademy.shapes;

public abstract class Shape {
    String shape;

    public Shape(String shape) {
        this.shape = shape;
    }
    
    abstract double getArea();
    
    public String getName() {
        return shape;
    }


}
