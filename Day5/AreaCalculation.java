package com.Day5;

abstract class Shapes {
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

	abstract void area();
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
			int area = (length * breadth * height) / 2;
			System.out.println("Area of triangle is" + area);
		}


	}

public class AreaCalculation {

	public static void main(String[] args) {
		
	
		Shapes s;
		s = new Rectangle(10,20);
		s.area();

		s = new Square(5);
		s.area();

		s = new Triangle(2,3,4);
		s.area();

	}

}

