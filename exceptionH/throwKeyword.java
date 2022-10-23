package exceptionH;

public class throwKeyword {

	class Students {
		private int age;

		public void setAge(int a) {
			if (a <= 0) {
				throw new ArithmeticException("Invaild Age");
			} else {
				age = a;
			}
		}

		public int getAge() {
			return age;
		}
	}

	public class ThrowKeyword {

		public void main(String args[]) {
			Students s = new Students();
			
			try {
				s.setAge(-12);
				System.out.println("Your age=" + s.getAge());
			} catch (ArithmeticException e) {
				System.out.println("e.getMessage");

			}
		}
	}

}