import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        /*  Ask the user to enter in numbers to add together. Once the user enters 0, the code will stop and the sum and the average of the numbers as well as the number of negative numbers will be printed.
        // Combine questions 1 & 2
        // Find & print the sum, average, and number of negative numbers
        // No other class is needed for this program */
        
        int num = 0;
        int sum = 0;
        double average = 0;
        int negative = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit ");
        int value = keyboard.nextInt();
        while(!(value == 0)){
            sum = sum + value;
            if(value<0){
                negative = negative + 1;
            }
            if (value>=0 || value<=0){
                num = num +1;
            }
            average = sum/num;
            System.out.println("Enter a number or 0 to quit ");
            value = keyboard.nextInt();
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is " + average);
        System.out.println("The number of negative numbers is " + negative);
        


    }

}