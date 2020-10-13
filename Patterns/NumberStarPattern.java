import java.util.*;
public class runner {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k=1,l;
        for(i=n;i>=1;i--)
        {
          
            for(j=n;j>=1;j--)
            {
                if(j==k)
                {
                    System.out.print("*");

                }
                else
                {
                   System.out.print(j);  
                }
            }
            System.out.println();
              k++;
        }

	}
}
