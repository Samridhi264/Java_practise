public class Solution {

	public static String compress(String texto){

         StringBuilder objString = new StringBuilder();

    int count;
    char match;

        count = texto.substring(texto.indexOf(texto.charAt(1)), texto.lastIndexOf(texto.charAt(1))).length()+1;
        match = texto.charAt(1);
        objString.append(count);
        objString.append(match);

    return objString.toString();
}
    }
