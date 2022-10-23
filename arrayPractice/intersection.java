package arrayPractice;

import java.io.*;
import java.util.*;

public class intersection {

	public static void intersect(int[] nums1, int[] nums2)
    {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        
         
        
        for(int i=0; i<nums1.length; i++) {
        	for (int j=0;  j<nums2.length; ++j) {
        		if(nums1[i]<nums2[j]) i++;
                else if(nums1[i]>nums2[j]) j++;
                else{
                    nums1[i++]=nums1[j];
                  
                }
        	}dfdf
         
        }
        
        int ans[]=new int[2];
        //int ans1[]= new int[2];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
          //  ans1[i]=nums2[i];
             
            
                
             
        }
         
        System.out.println(ans);
       // System.out.println(ans1);
             
        
        intersect(nums1,nums2);
         
        
    }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] nums1 = new int[m];
		for (int i = 0; i < m; i++) {
			nums1[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] nums2 = new int[n];
		for (int i = 0; i < m; i++) {
			nums2[i] = sc.nextInt();
		}
		intersect(nums1, nums2);

		// intersect(nums1,nums2);

	}

}