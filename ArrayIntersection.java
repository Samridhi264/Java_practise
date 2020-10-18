import java.util.*;
public class Intersection{
	
	public static void intersection(int[] arr, int[] arr1){
		
        int n=arr.length;
       
        int n1=arr1.length;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int j=0;
        for(int i=0;i<n &&j<n1;){
            if(arr[i]==arr1[j]){
                System.out.println(arr[i]);
                i++;j++;
            }
            else if(arr[i]>arr1[j]){
                j++;
            }
             else if(arr[i]<arr1[j]){
                i++;
            }
        }

	}
}
      
    
