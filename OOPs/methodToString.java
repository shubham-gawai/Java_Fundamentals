// Implement the method toString() for printing/ calling everything in one call :

package OOPs;
	
class Anonym {						//class

	String name;
	int age;
	static String course;

	Anonym() {						//constructor

//		this.name = "bJorn";
//		this.age = 27;
//		this.course = "C++";

	}

	public String getName() {					// getter
		return this.name;					 
	}
 
	public void setName(String name) {			// setter
		 this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		 this.age=age;

	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		 this.course=course;
	}
	
	
	public String toString() {
		return "Anonym [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	String display() {
		 return this.toString();
	}
	
}


public class methodToString {

	public static void main(String[] args) {
		Anonym s1 = new Anonym();
		
		Anonym s2 = new Anonym();
		// if we don't define the variables here, i.e. -> 	 s1.name="Ragnar";
		// it will directly fetch the values from the default constructor : 
		s1.name="Ragnar";
		s1.age= 38;
		s1.course="c";
		
		
		// calling getter :
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.course);
//		
		System.out.println(s1.display());
		
		//System.out.println(s1.toString());
		 // calling setter : 
//		 s1.setName("Ragnar");
//		 s1.setAge(23);
//		 s1.setCourse("Java");
//		 
		  
//		 s1.age=23;
//		 s1.course = "C++";
//		 s1.getAge();
//		 s1.getCourse();
 	  
	}

}
