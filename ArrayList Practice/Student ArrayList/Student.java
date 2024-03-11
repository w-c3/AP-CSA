import java.util.*;

public class Student {
    private String name;
    private int gradeLevel;
    
    private static ArrayList<Student> classList = new ArrayList <Student>();
    
    public Student(String name, int grade){
        this.name = name;
        gradeLevel = grade;
        classList.add(this);
        
    }
    
    public String getName(){
        return name;
    }


    public static void printList(){
        for (int i = 0;i<classList.size();i++){
            System.out.println(classList.get(i).getName());
        }
    }
    
    public static int returnSize(){
        return classList.size();
    }
    
    public static void removeStudent(String remName){
        for(int i =classList.size()-1; i>=0; i--){
            if(classList.get(i).getName().equals(remName)){
                classList.remove(i);
            }
            
        }
    }
    public static void shiftLeft(){
        classList.add(classList.get(0));
        classList.remove(0);
    }
}