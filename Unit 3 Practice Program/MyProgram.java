// Name: Will Coyne
// Date: 11/7/2023
// Program Info: Practice using if statements, using the Scanner class, and combining things we learn

import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        //create a Scanner Object
        //see OneNote/Programs - User input notes if needed
        Scanner input = new Scanner(System.in);
        //String keyboardinput = input.nextLine();
        
        //Part 1
        int int1 = (int)(Math.random() * 12) + 1;
        int int2 = (int)(Math.random() * 12) + 1;
        System.out.println("\nPart 1: ");
        System.out.print("What is the product of " + int1 + " * " + int2 + "? ");
        int userInput = input.nextInt();
        if (userInput == (int1*int2)){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
            System.out.println(int1 + " * " + int2 + " = " + (int1*int2));
        }
        
        //Part 2
        System.out.println("\nPart 2: ");
        System.out.println("Enter the first octet of IP address: ");
        int oct1 = input.nextInt();
        System.out.println("Enter the second octet of IP address: ");
        int oct2 = input.nextInt();
        System.out.println("Enter the third octet of IP address: ");
        int oct3 = input.nextInt();
        System.out.println("Enter the fourth octet of IP address: ");
        int oct4 = input.nextInt();
        if((oct1<=255 && oct2<=255) && (oct3<=255 && oct4<=255) && oct1>=0 && oct2>=0 && oct3>=0 && oct4>=0){
            System.out.println("IP Address: " + oct1 + "." + oct2 + "." + oct3 + "." + oct4);
        }else{
            if(oct1>255 || oct1<0){
                System.out.println("Octet 1 is incorrect");
            }if(oct2>255 || oct2<0){
                System.out.println("Octet 2 is incorrect");
            }if(oct3>255 || oct3<0){
                System.out.println("Octet 3 is incorrect");
            }if(oct4>255 || oct4<0){
                System.out.println("Octet 4 is incorrect");
            }
        }
        //Part 3
        System.out.println("\nPart 3: ");
        System.out.println("Enter x-coordinate: ");
        double x = input.nextDouble();
        System.out.println("Enter y-coordinate: ");
        double y = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
        double radius = 10.0;
        if (distance < radius){
            System.out.println("Point (" + x +", " + y + ") is in the circle");
        }
        else if((radius == distance) || (Math.abs(distance) == radius) || (Math.abs(distance) >= 9.9 && Math.abs(distance) <= 10.1)){
            System.out.println("Point (" + x +", " + y + ") is on the circumference of the circle");
        }else{
            System.out.println("Point (" + x +", " + y + ") is NOT in the circle");
        }
        
        //Part 4
        System.out.println("\nPart 4: ");
        int winningNum = (int)(Math.random() * 90) + 10;
        System.out.println("Can you guess the lottery number? Enter a 2 digit number:");
        int guess = input.nextInt();
        if(guess == winningNum){
            System.out.println("Congratulations, you guess the lottery number whis was, " + winningNum + "! You win $10,000!");
        }else if(guess >= winningNum-4 && guess <= winningNum+4){
            System.out.println("You are within 4 numbers of the lottery number, which was " + winningNum + ". You win $3000");
        }else if(guess >= winningNum-8 && guess <= winningNum+8){
            System.out.println("You are within 8 numbers of the lottery number, which was " + winningNum + ". You win $1000");
        }else{
            System.out.println("You did not win the lottery. The winning number was " + winningNum + ".");
        }
        input.close();
    }
}