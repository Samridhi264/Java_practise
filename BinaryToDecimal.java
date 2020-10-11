import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int n=0,num1,sum=0,pro,i,j,rem;
        num1=num;
        while(num1>0)
        {
            num1=num1/10;
            n++;
        }
        for(i=0;i<n;i++)
        {
            pro=1;
            rem=num%10;
            num=num/10;
            for(j=0;j<i;j++)
            {
                pro=pro*2;
            }
            sum=pro*rem+sum;
        }
        System.out.print(sum);    
	}
}
