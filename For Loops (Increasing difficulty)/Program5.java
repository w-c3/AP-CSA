import java.util.Scanner;
/* Programmer: Will Coyne
   Date: 11/29/2023
   Description:
*/
public class Program5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        text= text.replaceAll("\\s", "");  //removes spaces from phrase
        
        //remember to convert text to lowercase
        text = text.toLowerCase();
        // Your code goes below!
        if(isPalindrome(text)){
            System.out.println("Your word is a palindrome!");
        }else{
            System.out.println("Not a palindrome :(");
        }
        
        
    }
    
    // returns boolean based on if text is palindrome
    public static boolean isPalindrome(String text)
    {
        // Your code goes here!
        return text.equals(reverse(text));
    }
    
    
     //This method reverses a String.
     //You do NOT have to use this method
    public static String reverse(String text)
    {
        // Your code goes here!
        String r = "";
        for(int i = text.length() -1; i >= 0; i--){
            r = r + text.substring(i, i+1);
        }
        
        return r;
    }

}