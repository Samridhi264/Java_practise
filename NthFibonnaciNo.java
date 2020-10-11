import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1,b=1,c;
          if(n == 0)
          {
            System.out.print("0");
          }
        else if(n==1)
        {
            System.out.print("1"); 
        }
        else{
        for(int i = 3; i <= n; i++) { 
            c = a + b; 
            a = b; 
            b = c;
        }
		System.out.print(b);
        }
	}

}
