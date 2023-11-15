import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in); 
       // Your code starts here
       System.out.println("Starting the Taffy Timer... \n");
       int temp = 0;
       System.out.println("Enter the temperature: ");
       temp = input.nextInt();
       while (temp < 270){
            System.out.println("The mixture isn't ready yet.\n");
            System.out.println("Enter the temperature: ");
            temp = input.nextInt();
            
       }
       System.out.println("\nYour taffy is ready for the next step!");
    }
}