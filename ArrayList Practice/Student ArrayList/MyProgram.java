import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> iceCream = new ArrayList<String>();
        iceCream.add("Cookies and Cream");
        iceCream.add("Strawberry");
        iceCream.add("Vanilla");
        iceCream.add("Double Dunker");
        iceCream.add("Mint Chocolate Chip");
        iceCream.add("Chocolate Chip Cookie Dough");
        iceCream.add("Coffee");
        iceCream.add("Birthday Cake");
        iceCream.add("MooseTracks");
        iceCream.add("Banana");
        iceCream.add("Rocky Road");
        iceCream.add("Chocolate Marshmallow");
        
        System.out.println(iceCream);
        
        System.out.println("Size "+iceCream.size());
        System.out.println("Removed: "+iceCream.remove(2));
        
        System.out.println(iceCream);
        
        iceCream.add(2, "Cookie Monster");
    
        Student bob = new Student("Bob", 2);
        Student joe = new Student("Joe", 9);
        Student thelma = new Student("Thelma", 7);
        Student joey = new Student("Joe", 9);
        Student jerm = new Student("Jerm", 12);
        
       Student.printList();
    
        System.out.println("Classlist size: " + Student.returnSize());
        Student.removeStudent("Thelma");
        Student.printList();
        
        System.out.println(iceCream);
        
        System.out.println(iceCream.get(5));
        
        for (int i =0; i <iceCream.size(); i++){
            System.out.println(iceCream.get(i));
        }
        
        
        for (String flavor: iceCream){
            System.out.print(flavor+" ");
        }
        
        System.out.println();
        Student.printList();
        System.out.println();
        Student.shiftLeft();
        Student.printList();
        
        
        
        
        
        
        
        
        
        
    }
}