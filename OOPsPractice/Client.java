package OOPsPractice;

class AA {

	void show() 
	{
		System.out.println("AA");
	}
}

class BB extends AA {

	void show() 
	{
		System.out.println("BB");
	}
}

public class Client {
	public static void main(String args[]) {

		AA b = new BB();
		b.show();

	}
}
