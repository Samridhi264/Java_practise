
public class Solution {

	public static boolean checkPalindrome(String str){
		
        int j=str.length()-1;
        int flag=0;
        for(int i=0;i<str.length();)
        { 
            flag=0;
            if(str.charAt(i)==str.charAt(j))
            {
            i++;
            j--;
             flag=1;
            }
            else{
                return false;
            }  
        }
        return true;
	}
}
