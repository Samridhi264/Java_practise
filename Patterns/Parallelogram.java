import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here\
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j,k;
        for(int i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=j;k<n+i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        

	}
}
