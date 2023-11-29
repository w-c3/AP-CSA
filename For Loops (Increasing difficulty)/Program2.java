import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String word = input.nextLine(); 
         //write your code below
         for(int i = 0; i < word.length(); i++){
             System.out.println(word.substring(i, i+1));
         }
         for(int i = 0; i < word.length(); i = i +2){
             System.out.print(word.substring(i, i+1));
         }
         
    }
}