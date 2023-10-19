public class Calculator {
    private int number1;
    private int number2;
    
    //constructors
    public Calculator(){
        number1 = 100;
        number2 = 200;
    }
    public Calculator(int number3, int number4){
        number1 = 110;
        number2 = 220;
        
    }
    public void display(){
        System.out.println(number1);
        System.out.println(number2);
    }
    
    public void sum(){
        int ans = number1 + number2;
        System.out.println(number1 + "+" + number2 + " = " + ans);
    }
    
    //getter
    public int getNumber1(){
        return number1;
    }
    public int getNumber2(){
        return number2;
    }
    
    public void setNumber1(int a){
        number1 = a;
    }
    public void setNumber2(int a){
        number2 = a;
    }
}