package OOPs;
 
class pen {
	
	String color;
	String type; // ballPoint , gel
	

	public void write() {
		
		System.out.println("writing something");
	}

}

public class penClass {

	public static void main(String args[]) {
			
			pen  p1 = new pen();
			 
			p1.color = "black";
			p1.type  = "ballPoint";
			
			System.out.println(p1.color);
			System.out.println(p1.type);
	}

}
