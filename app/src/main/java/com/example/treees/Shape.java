package com.example.treees;

public abstract class Shape {
    int x, y;
    String colour = "$PUT_YOUR_CHOICE_OF_COLOUR";

    public abstract void getArea(int x, int y);
    public abstract void getPerimeter(int x, int y);
    public abstract void getShape();

}
