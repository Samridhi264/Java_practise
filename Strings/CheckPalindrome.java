
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int j=str.length()-1,f=0;
        for(int i=0;i<str.length();i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return false;
        }
        else
            return true;
	}

}
