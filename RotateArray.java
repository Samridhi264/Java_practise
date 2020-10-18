
public class Solution {  

    public static void rotate(int[] a, int d) {
   int n=a.length;
      int[] b = new int[n];
        int d1=d;
        int m=n-d;
        int i;
        for(i=0;i<n;i++)
        {
            b[i]=a[i];
        }
for(i=0;d<n;i++)
{
    
    a[i]=b[d];
    d++;
}  
//System.out.println("m="+m);
for(i=0;i<d1;i++)
{
    a[m]=b[i];
    m++;
}

      
    }
    }
