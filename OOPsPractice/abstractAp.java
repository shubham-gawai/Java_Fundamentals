package OOPsPractice;

abstract class Vehicle {

	String fuel;
	String cost;

	abstract void power();

	void fuelRequired(String fuel) {
		this.fuel = fuel;
		System.out.println(fuel);
	}

	void costWithTax(String cost) {
		this.cost = cost;
		System.out.println(cost);
	}

}

class Car extends Vehicle {

	@Override
	void fuelRequired(String fuel) {

		super.fuelRequired(fuel);
	}

	@Override
	void costWithTax(String cost) {

		super.costWithTax(cost);
	}

	void power() {
		System.out.println("1867cc");

	}

}

class Truck extends Vehicle {

	@Override
	void fuelRequired(String fuel) {

		super.fuelRequired(fuel);
	}

	@Override
	void costWithTax(String cost) {

		super.costWithTax(cost);
	}

	void power() {
		System.out.println("4567cc");

	}
}

public class abstractAp {
	public static void main(String args[]) {
		System.out.println("Car Specifications : ");
		Car c = new Car();
		c.fuelRequired("Petrol");
		c.costWithTax("35Lakhs");
		c.power();

		System.out.println();
		System.out.println("Truck Specifications :");
		Truck t = new Truck();
		t.fuelRequired("Diesel");
		t.costWithTax("45Lakhs");
		t.power();
	}
}
