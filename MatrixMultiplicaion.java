import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    int a[][];
    int b[][],mul[][];
    int sum=0;
    int n,i,r1,r2,c1,c2,j,k;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=0;i<n;i++)
    {
      r1=s.nextInt();
      c1=s.nextInt();
      a=new int[r1][c1];
      for(j=0;j<r1;j++)
      {
        for(k=0;k<c1;k++)
        {
          a[j][k]=s.nextInt();
        }
      }
      r2=s.nextInt();
      c2=s.nextInt();
      b=new int[r2][c2];
      for(j=0;j<r2;j++)
      {
        for(k=0;k<c2;k++)
        {
          b[j][k]=s.nextInt();
        }
      }
      int h=0;
      mul=new int[r1][c2];
      for(j=0;j<r1;j++)
      {
        for(k=0;k<c2;k++)
        {
          for(h=0;h<c1;h++)
          {
            sum=sum+a[j][h]*b[h][k];
          }
          mul[j][k]=sum;
          sum=0;
        }
      }
      for(j=0;j<r1;j++)
      {
        for(k=0;k<c2;k++)
        {
          System.out.print(mul[j][k]+" ");
        }
        System.out.print("\n");
      }
      
    }
  }
}
