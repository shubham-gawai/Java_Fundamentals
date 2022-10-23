package MARCH16;

//parent class 
class Animal{							
	
	boolean tail;
	int legs;
	float speed;
	float weight;
	static int age=10;
	
//methods :
	 	void isTail() {
		 System.out.println("I have a tail.");
	 	}
	 	void myLegs() {
			System.out.println("I have 4 legs.");
		}
		
		void mySpeed() {
			System.out.println("I run with speed.");
		}
		static int incrementAge(int age) {
			System.out.println(age);
			return age++;
		}

//getters and setters :
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

}
