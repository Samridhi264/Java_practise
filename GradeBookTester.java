import java.util.Scanner;

class GradeBookTester
{
    public static void main(String[] args)
    {
    GradeBook g1=new GradeBook();
    GradeBook g2=new GradeBook();
    GradeBook g3=new GradeBook();
    System.out.print("Students M1 M2 M3 Total");
    g1.DataInput();
    g2.DataInput();
    g3.DataInput();
    g1.print();
    g2.print();  
    g3.print();
    }
}
class Student{
    private String FirstName,LastName;
    private int m1,m2,m3;
    public void SetFirstName(name){
        FirstName=name;
    }
    public String GetFirstName(){
        return FirstName;
    }
    public void SetLastName(name){
        LastName=name;
    }
    public String GetLastName(){
        return LastName;
    }
    public void SetM1(marks){
        m1=marks;
    }
    public int GetM1(){
        return m1;
    }
     public void SetM2(marks){
        m2=marks;
    }
    public int GetM2(){
        return m2;
    }
     public void SetM3(marks){
        m3=marks;
    }
    public int GetM3(){
        return m3;
    }
    public int GetTotalMarks()
    {
        return m1+m2+m3;
    }

}
class GradeBook{
    Student s1=new Student();
    Scanner s=new Scanner(System.in);

    public static void DataInput(){
        Sytem.out.print("Student Name:");
    String FirstName=s.nextLine();
    String LastName=s.nextLine();
         Sytem.out.print("Marks for "+FirstName+LastName);
         System.out.print("Test 1: ");
    int m1=s.nextInt();
     System.out.print("Test 2: ");
    int m2=s.nextInt();
     System.out.print("Test 3: ");
    int m3=s.nextInt();
    s1.SetFirstName(FirstName);
    s1.SetLastName(LastName);
    s1.SetM1(m1);
    s1.SetM2(m2);
    s1.SetM3(m3);
    }
    public static void print()
    {
        System.out.print(s1.GetFirstName()+" "+s1.GetLastName()+" "+s1.GetM1()+" "+s1.GetM2()+" "+s1.GetM3());
    }

}
