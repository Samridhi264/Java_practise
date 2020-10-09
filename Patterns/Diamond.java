import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k,l,m,a,b;
        for(i=0;i<n/2+1;i++)
        {
            for(j=n/2-i;j>0;j--)
            {
            System.out.print(" ");
            }
            for(k=n/2;k<=n/2+i;k++)
            {
                System.out.print("*");
            }
            for(l=k;l<k+i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(m=1;m<=n/2;m++)
        {
         for(j=1;j<m+1;j++)
            {
            System.out.print(" ");
            }
            for(k=j;k<=n/2+1;k++)
            {
                System.out.print("*");
            }
           for(l=1;l<=n/2-m;l++)
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
