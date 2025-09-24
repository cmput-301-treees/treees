package com.example.treees;

public class Rectangle2 extends Shape{
    int x,y;

    public Rectangle2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void getArea(int x, int y) {
        int area = x * y;
        System.out.print("The area is: " + area);
    }

    @Override
    public void getPerimeter(int x, int y) {
        int perimeter = 2*x + 2*y;
        System.out.print("The perimeter is: " + perimeter);
    }

    @Override
    public void getShape() {
        Class<?> shape = this.getClass();
        System.out.print("This shape is a: " + shape);
    }
}
