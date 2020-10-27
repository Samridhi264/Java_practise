import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    int n,s=0,t=1;
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    while(n!=0)
    {
     if(n%10!=9)
     {
       s=s+(n%10+1)*t;
     }
      t=t*10;
      n/=10;
    } 
  System.out.print(s);

  }
}
