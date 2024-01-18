/* Modify this class
  1. Instance variables: String name and int points
  2. Create 2 constructors 
       one takes both attributes
       2nd one takes only the name attribute but you should set points = 0
  3. Create a toString method that will return text - name has ** points
  4. add getter methods for all instance variables
  5. add a setter method for all instance variables
  6. add a mutator method that will add a random number of points between 0 - 7 (inclusive)
  7. add comments to show constructors, getters, setter methods
  */
  public class Gamer {
    //instance variables
    private String name;
    private int points;
    //constructor 1
    public Gamer(String initName, int initPoints){
        name = initName;
        points = initPoints;
    }
    //constructor 2
    public Gamer(String initName){
        points = 0;
        name = initName;
    }
    //toString method
    public String toString(){
        return name + " has " + points + " points";
    }
    //getters
    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }
    //setters
    public void setName(String initName){
        name = initName;
    }
    public void setPoints(int initPoints){
        points = initPoints;
    }
    //random points added 1 thru 7
    public void randomPoints(){
        points = points + (int)(Math.random()*8);
    }
}

