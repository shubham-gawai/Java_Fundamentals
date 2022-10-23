package MARCH16;
 
//Main Class/method :
public class wedAssignment {

	public static void main(String[] args) {
		// all commented statements are the methods called from the parent class Animal:
		
		// dog class objects :
		Dog d = new Dog();

		d.tail = true; 
		d.legs = 4;
		d.speed = 24.8f;
		d.weight = 13f;
		 
		System.out.println("Tail =" + d.tail);
		//d.isTail();
		System.out.println("Legs =" + d.legs);
		//d.myLegs();
		//d.mySpeed();
		System.out.println("Speed =" + d.speed + "kmph");
		System.out.println("Weight =" + d.weight+ "kg");
		System.out.print("Dog barks like = ");
		d.bark();
		
		d.incrementAge(14);
		 
		System.out.println();
		
		// Cat class objects :
		Cat c = new Cat("meow meow");	 
		c.tail = true; 
		c.legs = 4;
		c.speed = 22.2f;
		c.weight = 3f;
		 
		System.out.println("Tail =" + c.tail);
		//c.isTail();
		System.out.println("Legs =" + c.legs);
		//c.myLegs();
		//c.mySpeed();
		System.out.println("Speed =" + c.speed + "kmph");
		System.out.println("Weight =" + c.weight+ "kg");
		System.out.print("Cat sounds like = ");
		c.displaySound();
		
		//c.incrementAge(15);
		
		
		System.out.println();
		
		// Cow class objects :
		Cow co = new Cow(7);	 
		co.tail = true; 
		co.legs = 4;
		co.speed = 16.4f;
		co.weight = 180f;
		
		System.out.println("Tail =" + co.tail);
		//co.isTail();
		System.out.println("Legs =" + co.legs);
		//co.myLegs();
		//co.mySpeed();
		System.out.println("Speed =" + co.speed + "kmph");
		System.out.println("Weight =" + co.weight+ "kg");
		System.out.print("milk amount = " );
		co.measureMilk();
		
		//co.incrementAge(12);
		
		System.out.println();
		
		// Elephant class objects :
		Elephant e = new Elephant("4feet");
		e.tail = true; 
		e.legs = 4;
		e.speed = 14.7f;
		e.weight = 900f;
		
		
		System.out.println("Tail =" + e.tail);
		//e.isTail();
		System.out.println("Legs =" + e.legs);
		//e.myLegs();
		//e.mySpeed();
		System.out.println("Speed =" + e.speed + "kmph");
		System.out.println("Weight =" + e.weight+ "kg");
		System.out.print("trunkSize = " );
		e.sizeOfTrunk();
		
		//e.incrementAge(35);
		  
	}

}
