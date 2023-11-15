import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner(System.in); 
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        System.out.println("Enter a number (-1 to quit): ");
        int num = input.nextInt();
        while (!(num == -1)){
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
            System.out.println("Smallest # so far: " + smallest);
            System.out.println("Largest # so far: " + largest);
            System.out.println("Enter a number (-1 to quit): ");
            num = input.nextInt();
        }
    }
}