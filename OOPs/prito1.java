package OOPs;
 

class Friend {
	String name;
	String course;
	int age;
	
	 protected Friend(){	// protected is accessible in main method 					
		 age =23;			// private is not accessible by the main method 
	 }
}

public class prito1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend s1 = new Friend();
		s1.name = "PRITAM";
		s1.course = "Instrumentation";
		//s1.age = 22;
		System.out.println(s1.name);
		System.out.println(s1.age);

	}
}