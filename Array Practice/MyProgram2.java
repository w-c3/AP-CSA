public class MyProgram2
{
    public static void main(String[] args)
    {
        String[] first = {"Gertrude", "Johnathon", "Andreas", "Andrew"};
        String[] last = {"Spencer", "Keller", "Dover", "Coy"};
        String[] full = combineNames(first, last);
        
        for(int j = 0; j < full.length; j++){
            System.out.println(full[j]);
        }
    }
    public static String[] combineNames(String[] first, String[] last){
        String[] full = new String[first.length];
        for(int i = 0; i < first.length; i++){
            full[i] = first[i] + " " + last[i] +" ";
        }
        return full;
    }
}