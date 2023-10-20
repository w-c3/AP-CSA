public class Runner
{
    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        System.out.println(duck1);
        
        Duck ducky = new Duck("pink", "purple");
        System.out.println(ducky);
        
        Duck goose = new Duck(true, "Gold");
        System.out.println(goose);
        
        duck1.printName();
        ducky.printName();
        goose.printName();
    }
}