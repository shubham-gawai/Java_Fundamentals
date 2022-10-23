package MARCH16;
 
class Elephant extends Animal{
	String trunkSize;
	
	Elephant(String trunk){
		this.trunkSize= trunk;
	}
	void sizeOfTrunk() {
		System.out.println(trunkSize);
	}
	 
}
