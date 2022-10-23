package OOPs;

class Student {
	String name;
	int age ;
	String course;
	
}
public class studentClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name="John";
		s1.age = 24;
		s1.course= "C++";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.course);

	}
	
}
