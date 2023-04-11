public class Car {
  private String name;
  private String engine;

  public static int numberOfCars;

  static {
    System.out.println("Static Block : When number of Car Object Initialized , the static counter will be increases");
  }

  public Car(String name, String engine) {
    this.name = name;
    this.engine = engine;
    numberOfCars++;
  }

  public static void numberOfCars(){
    System.out.println("Number Of Cars : " + numberOfCars);
  }

  @Override
  public String toString() {
    return "Car{" +
            "name='" + name + '\'' +
            ", engine='" + engine + '\'' +
            '}';
  }
}
