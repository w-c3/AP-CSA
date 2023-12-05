public class MyProgram {
    /*Programmer: will coyne
      Date: 12/4/2023
      Description: nested for loops practice
    */
    public static void main(String[] args) {
        //call each number method 
        //remember to print the number first
        //add a blank line between activities as shown
        //For example, the first one has been done for you
        System.out.println("Number 1:");
        number1();
        System.out.println();
        System.out.println("Number 2:");
        number2();
        System.out.println();
        System.out.println("Number 3:");
        number3();
        System.out.println();
        System.out.println("Number 4:");
        number4();
        System.out.println();
        System.out.println("Number 5:");
        number5();
        System.out.println();
        System.out.println("Number 6:");
        number6();
        System.out.println();
        System.out.println("Number 7:");
        number7();
        System.out.println();
    }
    //create a number method for each activity
    //each method must use nested for loops to generate the output
    public static void number1(){
        for(int i = 0; i <= 6; i++){
            for(int j = 1; j <1+ i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number2(){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void number3(){
        for(int i = 0; i < 5; i++){
            System.out.print("*");
            for(int j = 0; j < 10; j++){
                if(j==3 || j==6 || j==9){
                    System.out.print(j);
                }
            }
            System.out.println("*");
        }
    }
    public static void number4(){
        for(int i = 1; i <=4; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print(j + i);
            }
            System.out.println();
        }
    }
    public static void number5(){
        for(int i = 0; i <=5; i++){
            if(i%2 == 0){
                for(int j = 2; j <= 8; j=j+2){
                    System.out.print(j);
                }
            }else{
                for(int n = 1; n <= 4; n++){
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
    public static void number6(){
        for(int c = 0; c < 5; c++){
            for(int r = 1; r <1+ c; r++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number7(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9-i; j++){
                System.out.print(" ");
            }
            for(int w = 0; w < 2*i+1; w++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int t = 0; t <3; t++){
            for(int l = 0; l < 8; l++){
                System.out.print(" ");
            }
            for(int g = 0; g<3; g++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}