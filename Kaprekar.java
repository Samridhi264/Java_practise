import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      int num,n,i,j;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=0;i<n;i++)
      {
        num=s.nextInt();
        int sq,num1,num2,d=0;
        num1=num;
        num2=num;
        sq=num*num;
        while(num!=0)
        {
          num=num/10;
         d++;
        }
        int m=(int)Math.pow(10,d);
        if((sq/m+sq%m)==num1)
        {
          System.out.println("1");
        }
        else
        {
          System.out.println("0");
        }
      }
    }
}
