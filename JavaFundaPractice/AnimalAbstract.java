package JavaFundaPractice;

abstract class Animal {
	String name;
	int legs;
	int mouth;

	Animal(String name, int legs, int mouth) {
		this.name = name;					// note String name;
		this.legs = legs;
		this.mouth = mouth;
	}

	abstract void walk();

	abstract void eat();
}

class Dog extends Animal {
	Dog(String name, int legs, int mouth) {
		super(name, legs, mouth);
	}

	public void myName() {
		System.out.println(name);
	}

	public void walk() {
		System.out.println("I walk on street");
	}

	public void eat() {
		System.out.println("I eat Dog foods");

	}

}

class Lion extends Animal {
	Lion(String name, int legs, int mouth) {
		super(name, legs, mouth);
	}

	public void myName() {
		System.out.println(name);
	}

	public void walk() {
		System.out.println("I walk in a jungle");
	}

	public void eat() {
		System.out.println("I like meat only");

	}

	public void isKing() {
		System.out.println("I am a King");

	}
}


public class AnimalAbstract {
	

	public static void main(String[] args) {
		Animal d = new Dog("max", 4, 1);

		Animal l = new Lion("kingBarret", 4, 1);

		d.walk();
		d.eat();

		l.walk();
		l.eat();
		// l.isKing();
		 
		d.toString();
		l.toString();

	}

}
