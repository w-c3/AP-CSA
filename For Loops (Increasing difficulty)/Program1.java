import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        int end = input.nextInt();
        //write your code below
        for(int i = 1; i < end*2; i++){
            System.out.print(" " + i);
        }

    }
}