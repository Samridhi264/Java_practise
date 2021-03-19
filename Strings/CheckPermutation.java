import java.util.*;
class Solution {

	public static boolean isPermutation(String str1, String str2) {
if(str1.length()!=str2.length())
    return false;
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
	}
}
