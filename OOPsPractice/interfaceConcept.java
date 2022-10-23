// the best example to understand the implementations of interfaces through classes
// and extension of that classes again 
// this way we can do implement the multiple inheritance also : 
package OOPsPractice;

interface Mamal {
	
	void eats();	// one unimplemented method :
	
	public default void checkInput() {
		System.out.println("method from interfece");
	}

}
 
class Elephant implements Mamal {
	 int weight;
	 public void eats() {
		 System.out.println("parent class implements the properties of an interface ");
	 }
	 
	public int weightIs(int weight) {
		return this.weight = weight;
	}
}

class Sloth extends Elephant {
	void setlifeSpan() {
		System.out.println("child class extends the properties of a base class ");
	}
	
}

public class interfaceConcept {
	public static void main(String args[]) {
		Elephant e1 = new Elephant();
		e1.checkInput();		// method called from an interface 
		e1.eats();				// method called from implemented class
		System.out.println("Elephants weight is : " + e1.weightIs(790));
		
		Sloth s1 = new Sloth();
		s1.setlifeSpan();
	}
}

/*  -> by default all the parameters in the interface are public, static and final 
	-> all the methods in the interface are public, abstract and unimplemented with no return type 
	-> one unimplemented method must be present there in the interface extended class
	-> interfaced don't do anything they are always implemented through classes by extension
*/  

