import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n;i++)
        {
            int b=1;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    b=0;
                    break;
                }
               
            }
            if(b==1)
            {
               System.out.println(i+" ");  
            }
        }


		
	}
}
