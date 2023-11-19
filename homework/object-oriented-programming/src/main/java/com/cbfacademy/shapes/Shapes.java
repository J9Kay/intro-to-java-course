package com.cbfacademy.shapes;

import java.util.List;

public class Shapes {
    public static double computeArea(List<Enclosure> enclosures) {
        double totalArea = 0;
        for (Enclosure enclosure : enclosures) {
            totalArea += enclosure.area();
        }
        return totalArea;
    }

    public static double computePerimeter(List<Enclosure> enclosures) {
        double totalPerimeter = 0;
        for (Enclosure enclosure : enclosures) {
            totalPerimeter += enclosure.perimeter();
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {
        List<Enclosure> shapes = List.of(
                new Square(20),
                new Square(4),
                new Square(12),
                new Circle(15),
                new Circle(10),
                new Circle(5)
        );

        double totalArea = computeArea(shapes);
        double totalPerimeter = computePerimeter(shapes);

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
