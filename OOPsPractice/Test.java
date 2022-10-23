package OOPsPractice;

class GFG {
	protected void getData() 
	{
		System.out.println("Inside hello");
	}
}

class GS extends GFG {
	protected void getData() 
	{	
		
	
		System.out.println("Inside GS");
		super.getData();
	}
}

public class Test {
	public static void main(String[] args) 
	{
		GFG obj = new GS();
		obj.getData();
		 
	}
}
