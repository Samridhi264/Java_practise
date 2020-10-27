import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    int h,d,t,sal;
   Scanner s=new Scanner(System.in);
    sal=s.nextInt();
    h=sal/10;
    d=sal*20/100;
    System.out.println(h+d+sal);
    
  }
}
