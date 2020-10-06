import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
      int i,j;
          char c='A';
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
		
		
	}

}
