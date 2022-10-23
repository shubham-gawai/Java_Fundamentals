/*
	package pack1;
	 
	class A
	{
	    public A()
	    {
	        //public constructor
	    }
	}
	 
	package pack2;
	 
	import pack1.*;
	 
	class B
	{
	    A a = new A();   	//Compile Time Error
	}
	
	
	Check if compile time error exists. If yes, 
	correct the code to remove the error.

*/


package pack2;
 
import pack1.*;
 
class B
{
    A a = new A();   	//Compile Time Error
}