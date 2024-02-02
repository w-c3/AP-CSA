public class MyProgram3
{
    public static void main(String[] args)
    {
        int[] sequence = new int[20];
        sequence[0] = 0;
        sequence[1] = 1;
        //Calculating the numbers
        for(int i = 2; i < 20; i++){
            sequence[i] = sequence[i-2] + sequence[i-1];
        }
        //First 20 numbers
        System.out.println("First 20 values of the Fibonaci Sequence:");
        for(int j = 0; j < 20; j++){
            System.out.print(sequence[j] + " ");
        }
        System.out.println();
        //Odd Numbers
        System.out.println("Even Numbers:");
        for(int j = 0; j < 20; j++){
            if(sequence[j]%2 == 0){
                System.out.print(sequence[j] + " ");
            }
        }
        System.out.println();
        //Odd indices
        System.out.println("Values at Odd indices:");
        for(int z = 0; z < 20; z++){
            if(!(z%2==0)){
                System.out.print(sequence[z] + " ");
            }
        }
        System.out.println();
        //Index position
        System.out.println("Index position of 233 is: " + findIndex(sequence, 233));
    }
    
    public static int findIndex (int[] arr, int n) 
    {
        for(int q = 0; q < arr.length; q++){
            if(arr[q] == n){
                return q;
            }
        }
        return -1;
    }
}