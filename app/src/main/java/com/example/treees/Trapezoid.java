package com.example.treees;

public class Trapezoid extends Shape {


    @Override
    public void getArea(int x, int y) {
        int z = (x + y) * 2;
        System.out.print(z);
    }

    @Override
    public void getPerimeter(int x, int y) {
        int v = (2*x) + (2*y);
        System.out.print(v);
    }

    @Override
    public void getShape() {
        this.getClass();
    }
}
