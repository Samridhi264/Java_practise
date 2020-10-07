import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k,a,b;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=j;k<=n;k++)
            {
                System.out.print("*");
            }
             for(b=k+1;b<=n+i;b++)
            {
                 
                System.out.print("*");
            }
            
            System.out.println();
        }
		
	}

}
