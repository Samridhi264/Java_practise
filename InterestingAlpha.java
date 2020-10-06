import java.util.*;
public class Solution {
	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		int i,j,k=64+n;
        char chr;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                chr=(char)(k+j-1);
                System.out.print(chr);
            }
            System.out.println();
            k=k-1;
        }
	}
}
