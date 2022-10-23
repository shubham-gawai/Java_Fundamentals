package JavaFundaPractice;

public class replaceString {

	public static void main(String[] args) {
		
		// replace world -> bye
		//String str = "hello world";
		//System.out.println(str.replace("hello", "bye"));

		
		// replace second term hello -> hi :
	    String s = "hello world, hope you are doing good. Say my hello to your friend";
	    
	    System.out.println(s.lastIndexOf("hello"));
	    
	    System.out.println(s.replaceAll("hello","hi"));
	    
	    System.out.println(s.replaceFirst("hi", "hello"));
	}

}
