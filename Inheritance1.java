class Person
{
  String name,color;
  int number_of_eyes, debut_year;   
}

class Actor extends Person
{
Actor(String n,String c,int nu,int d){
 name=n;
 color=c;
 number_of_eyes=nu;
 debut_year=d;
 }
 public String toString(){
 return "The person "+name+" is an Actor. He is "+color+" in color, has "+number_of_eyes+" eyes and debut in "+debut_year;
 }
}


class Actress extends Person
{
 Actress(String n,String c,int nu,int d){
 name=n;
 color=c;
 number_of_eyes=nu;
 debut_year=d;
 }
public String toString(){
 return "The person "+name+" is an Actress. She is "+color+" in color, has "+number_of_eyes+" eyes and debut in "+debut_year;
}
}
