//DO NOT SUBMIT this program until we have added some additional methods together

//add a multi-line comment with Programmer, date, description for this program

public class Runner {

    public static void main(String[] args) {
       
       //create 2 gamer objects - one using each constructor
       Gamer john = new Gamer("John", 14);
       Gamer marco = new Gamer("Marco");
       //print both objects - add text Object 1 or 2: in front
       System.out.println(john.toString());
       System.out.println(marco.toString());
       //print object1's points using getter method - Object1's points: 14
       System.out.println(john.getPoints());
       //print object2's name using getter method - Object2's name: LaserBeam
       System.out.println(marco.getName());
       //call the setter method that will set the points for Object2
       marco.setPoints(100);
        //call the setter method that will change the name for Object1
       john.setName("Lil Marco");
       //print object2's points using getter method - Object2's points: 6
       System.out.println(marco.getPoints());
       //print object1's name using getter method - Object1's name: FlashGordan
       System.out.println(john.getName());
       //call the mutator method that will add a random number of points between 0 - 7 on both objects
       john.randomPoints();
       marco.randomPoints();
       //print both objects again - add text Object 1 or 2: in front
       System.out.println(john.toString());
       System.out.println(marco.toString());

    }

}
