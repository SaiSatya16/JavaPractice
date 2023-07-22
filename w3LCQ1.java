// Write the Java code as instructed.
// • Class Faculty has the following members.
// - String name, double salary as private instance variables
// - Constructor to initialize the instance variables
// - Method public double bonus (float percent) that returns the bonus computed as (percent /100.0) *salary
// - You should define method getDetails () to display name and salary of an
// Faculty
// - You should overload method getDetails () as getDetails (float percent)
// to display the name, salary and bonus of an Faculty
// • Class Hod extends class Faculty and has the following members.
// - String personalAssistant as private instance variable
// - Constructor to initialize the instance variables of Hod that includes the instance variables of Faculty
// - You should override method public double bonus (float percent) that returns the bonus of a Hod as 50 percent less bonus than a regular faculty
// - You should override method getDetails () to display the name, salary and personalAssistant of Hod.
// - You should override method get Details (float percent) to display the name, salary, personalAssistant and bonus of a Hod
// • Class InheritanceTest has the main method and the following functionality.
// - It creates objects of Faculty and Hod types, and also accepts the required input values.
// - Invokes methods getDetails () and getDetails (float percent) on Faculty and Hod obiects.

import java.util.*;
class Faculty{
  private String name;
  private double Salary;
  public Faculty(String name,double Salary){
    this.name = name;
    this.Salary = Salary;
  }
  public double bonus(float percent){
    return (percent/100.0)*Salary;
  }
  public String getDetails() {
    return name + ", " + Salary;
  }
  public String getDetails(float percent){
    return getDetails()+", bonus = "+bonus(percent);
  }
  
}
class Hod extends Faculty{
  private String persoanlAssistant;
  public Hod(String name, double Salary, String pa){
    super(name,Salary);
    this.persoanlAssistant = pa;
  }
  public double bonus(float percent){
    return 0.5*super.bonus(percent);
  }
  public String getDetails() {
    return super.getDetails()+ ", " + persoanlAssistant;
  }
  public String getDetails(float percent){
    return getDetails()+", bonus = "+bonus(percent);
  }
}

public class w3LCQ1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
    Faculty obj2 = new Hod(sc.next(),sc.nextDouble(),sc.next());
    System.out.println(obj1.getDetails());
    System.out.println(obj1.getDetails(10));
    System.out.println(obj2.getDetails());
    System.out.println(obj2.getDetails(10));
    
  }
}