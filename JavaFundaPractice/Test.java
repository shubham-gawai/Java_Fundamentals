package JavaFundaPractice;
class Vehicle()
{
	private String registrationNo;
	private int modelNo;
	
	Vehicle(String registrationNo,int modelno){
		this.registrationNo = registrationNo;
		this.modelno=modelNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

//	public void setRegistrationNo(String registrationNo) {
//		this.registrationNo = registrationNo;
//	}

	public int getModelNo() {
		return modelNo;
	}

//	public void setModelNo(int modelNo) {
//		this.modelNo = modelNo;
//	}
//	
	class Car extends Vehicle{
		
	}
	
	Car(String name, String color){
		this.name= name;
		this.color=color;
	}
	
	
	}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
