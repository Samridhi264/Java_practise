import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	int i,j;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

		
	}

}
