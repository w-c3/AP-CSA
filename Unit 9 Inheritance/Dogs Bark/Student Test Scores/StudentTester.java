import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Prompt the user for name, test scores, and service hours
        System.out.println("Please enter the student name: ");
        String name = input.nextLine();
        System.out.println("Please enter the Math Score: ");
        int math = input.nextInt();
        System.out.println("Please enter the ELA Score: ");
        int ela = input.nextInt();
        System.out.println("Please enter the Service Hours");
        int serviceHours2 = input.nextInt();
        // Create a HSStudent object
        HSStudent andrew = new HSStudent(name, math, ela, serviceHours2);
        // Print the results
        System.out.println("Pass Math? " + andrew.passMath());
        System.out.println("Pass ELA? " + andrew.passEla());
        System.out.println("Completed Service Hours? " + andrew.completeService());
        System.out.println(andrew.toString());
    }
}