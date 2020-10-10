import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		double hra,da,pf,al,ts;
        int  b;
        long t;
        char gr;
        Scanner s=new Scanner(System.in);
        b=s.nextInt();
        gr=s.next().charAt(0);
        hra=0.2*b;
        da=0.5*b;
        pf=0.11*b;
        if(gr=='A')
        {
            al=1700;
        }
        else if(gr=='B')
        {
            al=1500;
        }
        else
        {
            al=1300;
        }
        ts=(b+hra+da+al)-pf;
       
        System.out.print(Math.round(ts));
	}
}
