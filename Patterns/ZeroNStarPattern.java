import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int i,j,k=3,l,m;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=i;j++)
         {
             if(j==i)
             {
                 System.out.print("*");
             }
             else{
           System.out.print("0"); 
             }
         } 
         for(k=n-i;k>=1;k--)
         {
           System.out.print("0");  
         }
         System.out.print("*");
        for(l=n-i;l>=1;l--)
        {
            System.out.print("0");
        }
         System.out.print("*");
         for(m=2;m<=n&&m<=i;m++)
         {
             System.out.print("0");
         }
         
         System.out.println();
     }
	}	


}
