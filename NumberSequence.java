import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int i,flag=1;
        int n=s.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
        arr[i]=s.nextInt();
        }
      
        for(i=0;i<n;i++)
       {
           if(arr[i]>arr[i+1])
               
           {
              if(i==n-2)
               {
              flag=0;
                // System.out.print(n);   
               }
               // System.out.print(i); 
           }
       }
          for(i=0;i<n;i++)
       {
           if(arr[i]>arr[i+1])
               
           {
              if(i==n-2)
               {
              flag=0;
                // System.out.print(n);   
               }
               // System.out.print(i); 
           }
       }
      
        if(flag==0)
        {
             System.out.print("true");
        }
        else{
             System.out.print("false");
        }
	}
}
