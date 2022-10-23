 
import java.util.Arrays;
import java.util.Scanner;
public class accio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr1 =  new int[n];
    int[] arr2 =  new int[n+n];

    

     
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println(" ");

    
    for (int i = 0; i < arr2.length; i++) {
        arr2[i]= (arr1[i] = sc.nextInt());
    }
    
    for (int i = 0; i < arr2.length; i++) {
    	System.out.println(arr2[i]);
    }
    

 
//    int[] result = new int[length];
//    int position = 0;
//
//    //for each loop to add array1 elements to the resulting array
//    for (int element: array1) {
//      result[position] = element;
//      position++;
//    }
//
//    //for each loop to add array2 elements to the resulting array
//    for (int element: array2) {
//      result[position] = element;
//      position++;
//    }
//
//    System.out.println("\nThe resulting array after merging two arrays is: ");
//    System.out.println(Arrays.toString(result));
  }
}