package com.example.demo;

public interface Shape {
    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle rectangle) {
            return 2 * rectangle.length() + 2 * rectangle.width();
        } else if (shape instanceof Circle circle) {
            return 2 * circle.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }
}
