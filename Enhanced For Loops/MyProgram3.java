public class MyProgram3
{
    public static void main(String[] args)
    {
        int[ ] values = {525, 111, 416, 914, 124, 811};
        
        // Use an enhanced for loop to iterate through the array
        // Print out all values that are odd on their own line
        int n = 0;
        for ( int value : values){
            n++;
            if(!(n%2 == 0)){
                System.out.println(value);
            }
        }
        
        
    }
}