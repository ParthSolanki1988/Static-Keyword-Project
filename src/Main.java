public class Main {
  public static void main(String[] args) {
    //create object of car
    Car car = new Car("Jaguar", "V8");
    Car car1 = new Car("Bugatti", "W16");


    //print car details
    System.out.println(car);
    System.out.println(car1);


    //static method call without creating instance of class
    //and numberOfCars static variable print in numberOfCars() method in Car class
    Car.numberOfCars();


  }
}