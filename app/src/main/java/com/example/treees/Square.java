package com.example.treees;

public class Square extends Shape {
    @Override
    public void getArea(int x, int y) {
        System.out.println("Area of Square: " + (x * y));
    }

    @Override
    public void getPerimeter(int x, int y) {
        System.out.println("Perimeter of Square: " + (4 * x));
    }

    @Override
    public void getShape() {
        System.out.println("This is a Square");
    }
}
