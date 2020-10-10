import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	   int num,i;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }

	}
}
