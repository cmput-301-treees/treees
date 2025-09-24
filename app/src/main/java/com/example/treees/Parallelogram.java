package com.example.treees;

public class Parallelogram extends Shape{

    int x;
    int y;

    public Parallelogram(int length, int width){
        x = length;
        y = width;
    }
    public void getArea(int x, int y){
       int area = x * y;
       System.out.print(area);
    }

    public void getPerimeter(int x, int y){
        int perimeter = (2*x) + (2*y);
        System.out.print(perimeter);
    }

    public void getShape(){
        String shape = "Parallelogram";
        System.out.print(shape);
    }
}
