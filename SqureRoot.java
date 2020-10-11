import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
       long n=s.nextLong();
       long sq=1;
        for(long i=0;i<=n/2;i++)
        {
           if(i*i<=n)
           {
               sq=i;
           }
        }
System.out.print(sq);
	}
}
