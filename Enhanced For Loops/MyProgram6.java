public class MyProgram6
{
    public static void main(String[] args)
   {
        double[] numArray =  {93.0, 88.5, 73.5, 97.5, 83.5};
        
        // Create an ArrayAverage object and print the result 
        ArrayAverage dawg = new ArrayAverage(numArray);
        System.out.println("The average of the array is " + dawg.getAverage());
        
   }
}
public class ArrayAverage {
    private double[] values;

    public ArrayAverage(double[] theValues)
    {
      values = theValues;
    }
    
    public double getAverage()
    {
     // your code goes here!
     double num1 = 0.0;
     for(double num : values){
        num1 += num;
     }
     return num1 / values.length;
    }

}