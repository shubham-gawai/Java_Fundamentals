package OOPsPractice;

import java.util.Scanner;

abstract class Shape {
	double width;

	abstract void area();

}

class Square extends Shape {

	Square(double width) {
		this.width = width;
	}

	public double squareArea(double width) {
		double areaOfSquare = width * width;
		return areaOfSquare;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub

	}

}

class Circle extends Shape {

    Circle(double width){
        this.width = width;
    }
    
    

	public double cicrleArea(double width) {
    	
        double areaOfCircle = 3.14 * width * width;
        return areaOfCircle;
    }

fix this problem   

	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}

}

public class SquareCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		Square a = new Square(x);
		Circle b = new Circle(y);
		a.squareArea(x);
		b.cicrleArea(y);
	}
}
