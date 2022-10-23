/*  Create class named ""Vehicle"" with its basic characters as 
    instance variables and basic functionalities as functions
	create different objects like 1)bike 2)car, 3)trek
	Initialize instance variables of bike with no argument default constructor
	Initialize other objects using argument constructor
	declare getters and setters for this class
*/

package OOPs;

class vehicle {

	String model;
	String color;
	String type;
	float mileage;
	double power;
	double price;
	float weight;
	float taxes;

	// this vehicle constructor is for Truck :
/*	
	  vehicle(float weight, float taxes) { weight = 47500f; taxes = 7.32f; }
	  
	  public void setWeight() { this.weight = weight; }
	  
	  public float getWeight() { return this.weight; }
	  
	  public void setTaxes() { this.taxes = taxes; }
	  
	  public float getTaxes() { return this.taxes; }
*/

	public void setModel() {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setColor() {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setType() {    
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setMileage() {
		this.mileage = mileage;
	}

	public float getMileage() {
		return this.mileage;
	}

	public void setPower() {
		this.power = power;
	}

	public double getPower() {
		return this.power;
	}

	public void setPrice() {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

}

public class quotVehicle {

	public static void main(String args[]) {
		vehicle v1 = new vehicle(); // SKODA - car
		vehicle v2 = new vehicle(); // KTM - bike
		vehicle v3 = new vehicle(); // TATA - heavy truck

		System.out.println("vehilces Quotation -:");
		System.out.println();
// -------------------------------------------------------
		// first vehicle SKODA car
		v1.model = "Skoda Octavia";
		v1.color = "Candy white";
		v1.type = "car";
		v1.mileage = 15.81f;
		v1.power = 1984d;
		v1.price = 29.29d;

		System.out.println("model : " + v1.model);
		System.out.println("color : " + v1.color);
		System.out.println("type : " + v1.type);
		System.out.println("mileage : " + v1.mileage);
		System.out.println("power : " + v1.power);
		System.out.println("price : " + v1.price);

		System.out.println();
//--------------------------------------------------------
		// Second vehicle KTM bike
		v2.model = "KTM RC 390";
		v2.color = "orange-black";
		v2.type = "bike";
		v2.mileage = 26f;
		v2.power = 373d;
		v2.price = 2.77d;

		System.out.println("model : " + v2.model);
		System.out.println("color : " + v2.color);
		System.out.println("type : " + v2.type);
		System.out.println("mileage : " + v2.mileage);
		System.out.println("power : " + v2.power);
		System.out.println("price : " + v2.price);

		System.out.println();
//---------------------------------------------------------
		// third vehicle TATA heavy truck

		v3.model = "TATA SIGNA";
		v3.color = "orange-black";
		v3.type = "heavy truck";
		v3.mileage = 6.9f;
		v3.power = 4625.5d;
		v3.price = 52.81d;

		System.out.println("model : " + v3.model);
		System.out.println("color : " + v3.color);
		System.out.println("type : " + v3.type);
		System.out.println("mileage : " + v3.mileage);
		System.out.println("power : " + v3.power);
		System.out.println("price : " + v3.price);

	}
}
