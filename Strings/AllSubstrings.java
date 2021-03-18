
public class Solution {

	public static void printSubstrings(String s) {
        if(s.length()==0)
        {
            return ;
        }
		for(int i=0;i<s.length();i++)
        {
         for(int j=0;j<=i;j++)
         {
            System.out.print(s.charAt(j));
         }
            System.out.println();
        }
        printSubstrings(s.substring(1));
	}

}
