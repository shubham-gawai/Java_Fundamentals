package MARCH16;
 
class Cow extends Animal {
	int milkAmt;
	
	Cow(int milk){
		this.milkAmt = milk;
	}
	void measureMilk() {
		System.out.println(milkAmt);
	}
	 
}
