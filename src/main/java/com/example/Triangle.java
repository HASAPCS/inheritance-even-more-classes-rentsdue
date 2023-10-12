package com.example;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }


    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return this.side1+this.side2+this.side3;
    }
}

// TODO: Implement similar classes for Circle and Square
