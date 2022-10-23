// Override the taste method from the Candy class in the 
// Chocolate class to return “tastes chocolately”. It should print “tastes sweet!” 
// and then “tastes chocolately”.

package OOPs;

class Candy {
    String taste;

	 public void taste()
	 	{	
		 	System.out.println("tastes sweet");
	 	}

}    

class Chocolate extends Candy {

	@Override
	public void taste() {
		 
		super.taste();
		System.out.println("tastes chocolately");
	}
	 
 
}

 public class Fri18Mar_Q1 {
	  
    public static void main(String[] args)
    {
        Chocolate c = new Chocolate();
        
        c.taste();
       
    }
}
 

