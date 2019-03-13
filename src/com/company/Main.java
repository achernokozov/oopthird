package com.company;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
	 Circle myCircle = new Circle(4.2);
	 myCircle.calculateArea(myCircle.getRadius());
	 myCircle.setColor(myCircle, Color.BLUE);
	 myCircle.getColor();

	 Square mySquare = new Square(2);
	 mySquare.calculateArea(mySquare.getSide());
	 mySquare.setColor(mySquare,Color.WHITE);
	 mySquare.getColor();

    }
}
