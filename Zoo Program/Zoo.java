public class Zoo {
    
    private String species;
    private int age;
    private boolean isHungry;
    private String color;
    private boolean awake;

    public Zoo (){
        species = "unicorn";
        age = 10000;
        isHungry = true;
        color = "rainbow";
        awake = false;
    }
    
    public Zoo(String initSpecies){
        species = initSpecies;
        age = 70;
        isHungry = true;
        color = "brown";
        awake = true;
    }
    
    public Zoo(String initSpecies, int initAge, boolean initisHungry)
    {
        species = initSpecies;
        age = initAge;
        isHungry = initisHungry;
        color = "invisible";
        awake = false;   
    }
    public void play(){
        System.out.println("The " + species+ "is playing");
    }
    public void play(String toy){
        System.out.println("The " + species+ "is playing with a " + toy);
    }
    
    
    public void setAge(int initAge){
        age = initAge;
        
    }
}