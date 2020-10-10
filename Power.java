import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
         int num,pow,pro=1,i;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        pow=s.nextInt();
        for(i=0;i<pow;i++)
        {
            pro=pro*num;
        }
        System.out.print(pro);
	}
}
