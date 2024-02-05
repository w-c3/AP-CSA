public class MyProgram5
{
     public static void main(String[] args){
         
        Fruit lemon = new Fruit("Lemon", 1.4, 5);
        Fruit apple = new Fruit("Apple", 19, 25);
        Fruit watermelon = new Fruit("Orange", 9, 11);
        Fruit banana = new Fruit("Banana", 17, 31);
        Fruit strawberry = new Fruit("Peach", 13, 14);
        
        // create an array of Fruit items
        Fruit[] array = {lemon, apple, watermelon, banana, strawberry};
        System.out.println("Fruit   Sugar   Carbs");
        for (Fruit fruits : array){
            System.out.println(fruits.getName() + "   " + fruits.getSugar() + "     " + fruits.getCarbs());
        }
      
        
        // use an enhanced for loop to access each Fruit item
        // create a table using an escape sequencewith Fruit's 
        // name, sugar, and carbs
         
         
         
     }
}
public class Fruit {
    private String name;
    private double sugar;
    private int carbs;
    
    public Fruit(String initName, double initSugar, int initCarbs){
        name = initName;
        sugar = initSugar;
        carbs = initCarbs;
    } 
    
    //add getters to return the values of all instance variables
    public String getName(){
        return this.name;
    }
    public double getSugar(){
        return this.sugar;
    }
    public int getCarbs(){
        return this.carbs;
    }


}