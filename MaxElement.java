import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<5;i++)
    {
      arr[i]=s.nextInt();
    }
    int sum=0;
    for(int i=0;i<5;i++)
    {
      if(sum<arr[i])
      {
        sum=arr[i];
      }
    }
    System.out.print(sum);
  }
}
