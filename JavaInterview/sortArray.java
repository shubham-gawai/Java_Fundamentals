package JavaInterview;
import java.util.*;
class sortArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            if(arr[i+1]==0){
                arr[i]=0;
            }
           System.out.println(arr);
        }
        // for(int i=0; i<n; i++){
        //     System.out.println(arr);
        // }

        
        input is : 1 0 0 1 0 0 1
        output : 1 1 1 0 0 0 0

    }
}