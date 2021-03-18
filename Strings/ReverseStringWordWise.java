public class Solution {
	public static String reverseWordWise(String str) {
		String[] s=str.split(" ");
      
        int n=s.length-1;
        String temp;
        for(int j=0;j<s.length/2;j++)
        {
          temp=s[j];
          s[j]=s[n];
           s[n]=temp;
            n--;
        }
       str="";
        for(int i=0;i<s.length;i++)
        {
            str=str+s[i]+" ";
        }
        return str;
	}
}
