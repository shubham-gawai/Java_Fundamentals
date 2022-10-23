package array2dPractice;

public class stringConcat2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] str = { {"Hello", "Geekster"}, {"Good", "Day", ""} };
		
		//op _ Row 0 : HelloGeekster
		//	   Row 1 : GoodDay
		
		for(int i=0; i<str.length; i++) {
		for(int j=0; j<str[0].length; j++){
			
			System.out.print(str[i][j]);
			 
		}
		System.out.println();
		 
	}
	}
}
