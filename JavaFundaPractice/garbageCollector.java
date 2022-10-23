package JavaFundaPractice;

class MyClass{
	
	public void finalize() {
		System.out.println("Garbagecollector");
		int f = 4/0;
		System.out.println("After exception");
	}
}
public class garbageCollector {

	public static void main(String[] args) {
		MyClass a = new MyClass();
		MyClass b = new MyClass();
		
		a = null;
		//b = null;

		System.out.println("before gc");
		System.gc();
		System.out.println("after gc");
	}

}

/* for each object finalize is going to run here it ran two times 
 * coz we have created two objects for class MyClass :
*/
 
