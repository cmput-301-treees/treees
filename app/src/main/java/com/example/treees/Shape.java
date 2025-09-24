package com.example.treees;

public abstract class Shape {
    String color = "orange";
    int x, y;

    public abstract void getArea(int x, int y);
    public abstract void getPerimeter(int x, int y);
    public abstract void getShape();

}
