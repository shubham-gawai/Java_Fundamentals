// anonymus class 
abstract class Human {

	abstract void show();

}



public class AnonymusClass {
	public static void main(String args[]) {

		Human h = new Human() {

			void show() {
				System.out.println("Im the one yeah !");

			}

		};
		h.show();

	}
}