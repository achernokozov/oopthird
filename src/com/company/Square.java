package com.company;

public class Square extends Figure implements Constants{
    private int side;

    Square(int side){
        this.side=side;
    }

    public Color getColor() {
        System.out.println("Square color "+Color.valueOf(color.name()));
        return color;
    }
    public Color color;

    public int getSide() {
        return side;
    }

    @Override
    void calculateArea() {
    }
    void calculateArea(int side){
        System.out.println("Square area " + side*4);
    }
}
