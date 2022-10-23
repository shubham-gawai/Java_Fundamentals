package OOPsPractice;

class Employee {
	String id ;
	String name;
	String department;
	static String worklocation;
	
	 
	public String getID() {				 
		return this.id;					  
	}

	public void setID(String ID) {
		 this.id = id;
	}
	
	public String getName() {				 
		return this.name;					  
	}

	public void setName(String name) {
		 this.name = name;
	}
	
	public String getDepartment() {				 
		return this.department;					 
	}

	public void setDepartment(String department) {
		 this.department = department;
	}
	
	public String getWorklocation() {				 
		return this.worklocation;					  
	}

	public void setWorklOcation(String worklocation) {
		 this.worklocation = worklocation;
	}
	
	 
	@Override
	public String toString() {
		return "Employee [id =" + id + ", name = " + name + ", department = " + department +",worklocation = "+ worklocation+ "]";
	}

 

}

public class employeeDetails {
	public static void main(String args[]) {
		
		Employee E1 = new Employee();        
		
		// calling objects :
		E1.id ="T0164" ;
		E1.name="Shubham";
		E1.department = "Devlopment";
		E1.worklocation = "Banglore";
		
		
		// calling toString method :
		System.out.println(E1);
	 
	}
}
