import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k,l,m;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<1;j++)
            {
                System.out.print("*");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(l=n-1;i>=n&&l;l++)
            {
                System.out.print(l); 
            }
            for(m=1;i>0&&m<=1;m++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
