package OOPsPractice;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		int area = length * breadth;
		System.out.println("Area of Reactangle : "+area +" Unit");
		
	}

	public void printPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle : " + perimeter +" Unit");
	}
}

public class areaPerimeter {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(25, 40);
		rec.printArea();
		rec.printPerimeter();

	}

}
