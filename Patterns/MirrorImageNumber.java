import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
	int i,j=0;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(i=1;i<=n;i++)
      {
         for(int k=1;k<=(n-i);k++)
         {
             System.out.print(" ");
         }
          for(int g=1;g<=i;g++)
          {
              System.out.print(g);
          }
          System.out.println();
      }

		
	}

}
