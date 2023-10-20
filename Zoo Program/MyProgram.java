public class MyProgram
{
    public static void main(String[] args)
    {
        
        Zoo unicorn = new Zoo();
        Zoo animal = new Zoo("bear");
        Zoo animal3 = new Zoo("penguin",23, true);
        System.out.println(unicorn);
        System.out.println(animal);
        System.out.println(animal3);
        
        animal3.play();
        animal.play("fish");
        unicorn.age(12);
    }
    
    
    
}