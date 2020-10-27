import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int[10];
    for(int i=0;i<10;i++)
    {
      a[i]=s.nextInt();
    }
    int sum=0;
    for(int i=9;i>=0;i--)
    {
      b[i]=a[sum];
      sum++;
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(b[i]);
    }
  }
}
