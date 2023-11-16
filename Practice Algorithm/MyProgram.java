import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1: ");
        int input1 = input.nextInt();
        System.out.println("Number 2: ");
        int input2 = input.nextInt();
        
        while(!(input1 == input2)){
            if (input1%2 == 0){
                while(input1<= input2){
                    System.out.print(input1 + " ");
                    input1 = input1 +2;
                }
            }
            else{
                input1 = input1 + 1;
                if(!(input1 == input2)){
                    System.out.print(input1 + " ");
                    input1 = input1 + 2;
                }
            }
            
        }
     
    }
}