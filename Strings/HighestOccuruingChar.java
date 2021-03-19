// highest occurring character in the String.
public class Solution {

	public static char highestOccuringChar(String str) {
         int count=0,countend=0;
        
         char c=str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                   count++; 
                }
            }
           
            if(count>countend)
            {
              countend=count;
              c=str.charAt(i);
              //  System.out.println(count+" "+c);
            }
             countend=count;
        }
        return c;
	}
}
