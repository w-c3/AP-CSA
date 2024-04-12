import java.util.*;
public class Harder {
    public static void main(String[] args){
        //Original ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <= 100; i++){
            list.add(3*i);
        }
        System.out.println("Original ArrayList: " + list);
        //Remove even values
        removeEvens(list);
        System.out.println("Remove even values: " + list);
        //New ArrayList size
        System.out.println("New ArrayList size: " + list.size());
        //Valus that are evenly divisible by 9
        
        System.out.println("Numbers of items divisible by 9: " + countNum(list));
    }
    public static void removeEvens(ArrayList<Integer> array){
        for(int i=0; i < array.size(); i++){
            if((array.get(i)%2 == 0)){
                array.remove(i);
            }
        }
    }
    public static int countNum(ArrayList<Integer> array){
        int unicorn = 0;
        for(int num : array){
            if(num%9==0){
                unicorn++;
            }
        }
        return unicorn;
    }
}