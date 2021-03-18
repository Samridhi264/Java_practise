
public class Solution {

	public static int countWords(String s) {	
        if(s.length()==0)
        {
            return 0;
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
             c++;   
            }
        }
        return c+1;
    }
 
}
