package com.example.treees;

public class Triangle extends Shape{

    @Override
    public void getArea(int x, int y) {
        System.out.println("The area is " + ((x * y) / 2));
    }

    @Override
    public void getPerimeter(int x, int y) {

    }

    @Override
    public void getShape() {

    }
}
