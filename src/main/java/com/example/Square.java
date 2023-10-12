package com.example;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side=side;
    }

    @Override
    public double area() {
        return this.side*this.side;
    }

    @Override
    public double perimeter() {
        return this.side*4;
    }
}