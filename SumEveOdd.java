import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int num,eve=0,odd=0,rem;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            if(rem%2==0)
            {
                eve=eve+rem;
            }
            else{
                odd=odd+rem;
            }
        }
     System.out.print(eve+ "   "+odd);
	}
}
