public class MyProgram
{
    public static void main(String[] args)
    {
        Calculator nop = new Calculator();
        Calculator twop = new Calculator(20,40);
        nop.display();
        
        twop.sum();
        
        System.out.println(twop.getNumber1());
        
        twop.setNumber1(200);
        twop.sum();
        
        twop.setNumber2(1201200812);
        twop.sum();
        
        
    }
}