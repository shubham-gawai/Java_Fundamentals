package MARCH16;
 

class Cat extends Animal{
	String soundIs;
	
	Cat(String sound){
		this.soundIs = sound;
	}
	 
	void displaySound() {
		System.out.println(soundIs);
	}
	 
	 
}
