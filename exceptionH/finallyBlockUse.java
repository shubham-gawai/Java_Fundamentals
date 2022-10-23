package exceptionH;

public class finallyBlockUse {

	public static void main(String args[]) {
		
        int n=20,number;
        
        
        try{
            number=n/0;
        }
        
        catch(Exception e){
            System.out.println("A number cannot divided by 0");
        }
        
        finally{
        	System.out.println("Finally Block:");
        }
        	System.out.println("Hello");
            System.out.println(n);
        // finally block gets executed whatever the errord does program conatins, 
        // all blcok of code gets executed after the finally block 
    }

}
