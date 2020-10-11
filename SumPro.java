import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int sum=0,pro=1;
        if(c==1)
        {
            for(int i=0;i<=n;i++)
            {
                sum+=i;
            }
            System.out.print(sum);
        }
        else if(c==2)
        {
            for(int i=1;i<=n;i++)
            {
                pro*=i;
            }
            System.out.print(pro); 
        }
        else
        {
            System.out.print("-1");
        }
	}
}
