public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car shaunda = new Car("Honda", "20");
        // Print out the model
        System.out.println(shaunda.getModel());
        // Print out the MPG
        System.out.println(shaunda.getMPG());
        // Print the object
        System.out.println(shaunda.toString());
        // Create an ElectricCar object
        ElectricCar frank = new ElectricCar("Tesla");
        // Print out the model
        System.out.println(frank.getModel());
        // Print out the MPG
        System.out.println(frank.getMPG());
        // Print the object
        System.out.println(frank.toString());
    }
}