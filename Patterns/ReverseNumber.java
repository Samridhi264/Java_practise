import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		
    int i,j;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
		
		
	}

}
