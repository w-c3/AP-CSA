import java.util.Scanner;
public class Program4
{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("In:");
    String s = input.nextLine();
    //write your code below
    for(int i = s.length() -1; i >= 0; i--){
        System.out.print(s.substring(i, i+1));
    }
    
    
    
  }
}