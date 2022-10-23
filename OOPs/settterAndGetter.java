package OOPs;
	
class Anonymus {				//class

	String name;
	int age;
	String course;

	Anonymus(String name, int age, String course) {				//constructor

		this.name = name;
		this.age = age;
		this.course = course;

	}

	public String getName() {				// getter
		return this.name;					// setter 
	}

	public void setName(String name) {
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
}

public class settterAndGetter {

	public static void main(String[] args) {
		Anonymus s1 = new Anonymus("Shubham", 23, "C++");
 
		System.out.println("Name is : " + s1.getName());
		System.out.println("Age is : " + s1.getAge());
		System.out.println("Course chosen " + s1.getCourse());
		
		
	}

}
