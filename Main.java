class Car{
   int wheels;//instance variables
   int seats;
   String name;
  public Car(int w, int s){ //constructor
    wheels = w;
    seats = s;
    //name = n;
  }
  public Car(int w, int s, String n){
    this(w,s); // calling the constructor from another constructior
    name = n;
  }
  public Car(Car c){ //Copy Constructor
    this.wheels = c.wheels;
    this.name = c.name;
    this.seats = c.seats;
  }
  public void breake(){
    //method
    System.out.println(wheels);
  }
  public void start(){
    //method
  }
  
}



class employee{
  private String name;
  private int empid;
  public void setname(String n){ // mutator
    name = n;
  }
  public void setempid(int eid){
    empid = eid;
  }
  public String getname(){ //accessor
    return name;
  }
  public int getempid(){
    return empid;
  }
  public void details(){
    System.out.println("name:"+name);
    System.out.println("empid:"+empid);
    
  }
  
}













class Main {
  public static void main(String[] args) {

    Car c1 = new Car(4,4,"car1"); //object creation
    Car c2 = new Car(5,3,"car2");
    Car c3 = new Car(c1); //copying values from c1
    System.out.println("c1 Wheels: "+ c1.wheels);
    System.out.println("C3 Wheels: "+ c3.wheels);

    employee obj1 = new employee();
    obj1.setempid(123);
    obj1.setname("abc");
    obj1.details();
    System.out.println(obj1.getname());
    System.out.println(obj1.getempid());

  }
} 