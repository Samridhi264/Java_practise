import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a%4==0)
      {
        if(a%100==0)
        {
          if(a%400==0)
          {
            System.out.println("Leap Year");
          }
          else
          {
            System.out.println("Not a Leap Year");
          }  
        }
        else
         {
            System.out.println("Leap Year");
          }  
      }
      else
         {
            System.out.println("Not a Leap Year");
          }  
    }
}
