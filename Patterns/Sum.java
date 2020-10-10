import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=0;
          for(j=1;j<=i;j++) 
          {
               sum=sum+j;
              if(j==1)
              {
              System.out.print(j);    
              }
             else if(j>1)
             {
              System.out.print("+" +j);
             }
          }
            System.out.println("="+sum);
        }
        
	}
}
