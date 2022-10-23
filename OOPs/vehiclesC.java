package OOPs;

class Vehicles {
	String model;
	String color;
	int power;
	 
}
	class Car extends Vehicles {
		  String ac;
	}

	 class Truck extends Vehicles {
		boolean container;
	}

	 class Scooter extends Vehicles {
		String seat;
	}



public class vehiclesC {
	
	public static void main(String args[]) {
	Vehicles c = new Vehicles();
	c.model = "skoda";
	c.color = "Candy White";
	c.power = 1890;
	
	Car ca = new Car();
	ca.ac = "Present";
	  
	Vehicles t = new Vehicles();
	t.model = "Tata";
	t.color = "LightBlue";
	t.power = 4500;
	
	Truck tr = new Truck(); 
	tr.container= true;
	
	Vehicles s = new Vehicles();
	s.model = "Scooty";
	s.color = "redblack";
	s.power = 90;
	
	Scooter sc = new Scooter();
	sc.seat = "two seats";
	
	 
	
	}
	
}
