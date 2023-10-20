public class Duck {
    private String duckColor;
    private String beakLength;
    private String beakColor;
    private String name;
    private boolean items;
    
    public Duck(){
        //default constructor
        duckColor = "yellow";
        beakLength = "medium";
        beakColor = "orange";
        name = "Chicken Jo";
        items = true;
    }
    public Duck(String initduckColor, String initBeakColor){
        duckColor = initduckColor;
        beakColor = initBeakColor;
        beakLength = "medium";
        name = "Chicken Joe";
        items = false;
    }
    public Duck(boolean initItems, String initDuckColor){
        items = initItems;
        duckColor = initDuckColor;
        name = "Checken Jeremry";
        beakColor = "Tame impala";
        beakLength = "mid fr";
    }
    public void printName(){
        System.out.println(name);
        
    }
}