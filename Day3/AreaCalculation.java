package com.Day3;

class Shapes {
	int length;
	int breadth;
	int side;
	int height;

	public Shapes(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(int side) {
		super();
		this.side = side;
	}

	public Shapes(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	void area() {
		System.out.println("Cannot define area for shapes");
	}

}

class Rectangle extends Shapes {

	public Rectangle(int length, int breadth) {
		super(length, breadth);

	}

	void area() {
		int area = length * breadth;
		System.out.println("Area is" + area);
	}
}

class Square extends Shapes {

	public Square(int side) {
		super(side);

	}

	void area() {
		int area = side * side;
		System.out.println("Area of square is" + area);
	}

}

class Triangle extends Shapes {

	public Triangle(int length, int breadth, int height) {
		super(length, breadth, height);

	}

	void area() {
		int area = (length * breadth * height)/2;
		System.out.println("Area of triangle is" + area);
	}

}

public class AreaCalculation {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.area();

		Square square = new Square(10);
		square.area();

		Triangle triangle = new Triangle(10, 20, 30);
		triangle.area();

	}

}
