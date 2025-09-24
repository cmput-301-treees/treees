package com.example.treees;

public class Rectangle extends Shape{

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void getArea(int x, int y){
        System.out.println("Area: " + (x * y));
    }
    @Override
    public void getPerimeter(int x, int y) {
        System.out.println("Perimeter: " + (x+y)*2);
    }
    @Override
    public void getShape(){
        System.out.println("Rectangle");
    }
}
