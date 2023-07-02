class Car{
  private int wheels;//instance variables
  private int seats;
  private string name;
  public Car(int w, int s, string n){ //constructor
    wheels = w;
    Seats = s;
    name = n;
  }
  public void breake(){
    //method
    System.out.println(wheels);
  }
  public void start(){
    //method
  }
  
}




class Main {
  public static void main(String[] args) {

    Car c1 = new Car(4,4,"car1");
    Car c2 = new Car(5,3,"car2");

  }
}