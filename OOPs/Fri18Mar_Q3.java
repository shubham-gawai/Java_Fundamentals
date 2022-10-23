/*Write a method that overloads the talk method by taking in a name 
and printing “Hello” with that name.*/
package OOPs;

class Test1 {
	
    public static void talk()
    	{
           System.out.println("hello there!");
    	}

   public static void talk(String name) 
    	{
    		System.out.println("Hello"+" "+ name);
    	}
    
}

public class Fri18Mar_Q3 {
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		
		//t.talk();
		t.talk("Matthew");
		
		
	}
}
