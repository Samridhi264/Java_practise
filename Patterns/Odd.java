
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j,k,a,c;
        for(int i=1;i<=n*2;i=i+2)
        {
           a=i; 
            c=1;
            for(j=i;j<=n*2;j=j+2)
            {
               System.out.print(a);
               a=a+2; 
            }
           for(k=1;k<i;k=k+2)
            {
                System.out.print(c);
               c=c+2;
            }
           // n=n-2;
            System.out.println();
        }
	}
}
