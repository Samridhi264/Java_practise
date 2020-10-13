public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		for(int i=start;i<=end;i=i+step)
        {
            System.out.println(i+"\t"+((i-32)*5)/9);
        }
	}
}
