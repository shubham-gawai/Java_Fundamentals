package OOPsPractice;
 
class Dog {
	
	  private String name;

	    public Dog(String name)
	    {
	        this.name = name;
	    }

	    public boolean equals(Object other)
	    { 
			return false;
	    }
	
	    public void speak()
	    {
	    	System.out.println("woof!");
	    }
 
}

class Beagle extends Dog {
	
    	public Beagle(String name) 
    	{
    		super(name);
    		// TODO Auto-generated constructor stub
    	}

		public void speak()
    	{
    		System.out.println("arf arf");
    	}
 }


public class Thu17Mar_Q1 {
    public static void main(String[] args)
    {
    	Dog d = new Dog("Max");
        d.speak();
        Dog b = new Beagle("Peny");
        b.speak();
    	    
    }
}


