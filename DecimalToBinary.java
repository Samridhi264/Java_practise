import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i=0,j;
        int arr[]=new int[20];
        if(num==0)
        {
          System.out.print("0");   
        }
        while(num>0)
        {
            i++;
            arr[i]=num%2;
            num=num/2;
        }
        for(j=i;j>0;j--)
        {
            System.out.print(arr[j]);
        }
        
	}
}
