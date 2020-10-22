public class solution {

	public static String removeAllOccurrencesOfChar(String s, char c) {

        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;

}}
