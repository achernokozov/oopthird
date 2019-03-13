package com.company;

public class Circle extends Figure implements Constants{
    private double radius;

    public Color getColor() {
        System.out.println("Circle color "+Color.valueOf(color.name()));
        return color;
    }

    public Color color;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    void calculateArea() {
        System.out.println("Pi*R*R");
    }
    void calculateArea(double radius){
        System.out.println("Circle area ".concat(String.valueOf(Math.pow(radius, 2)*Constants.Pi)));
    }
}
