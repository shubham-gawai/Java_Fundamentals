package MARCH17;

public class thuAssignment {
	public static void main(String[] args)
    {
        Dog d = new Dog("Rufus");
        d.speak();
        Beagle b = new Beagle("Sally");
        b.speak();
        
        Dog d1 = new Dog("Rufus");
        Beagle b1 = new Beagle("Rufus");
        
 
        System.out.println(d.equals(b));
        System.out.println(b.equals(d1));
        System.out.println(d1.equals(b1));
        System.out.println(d.equals(b1));
    
    }	
}
