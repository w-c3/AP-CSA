public class MyProgram
{
    public static void main(String[] args)
    {
        int num[] = {10,20,30,40,50};
        for(int i = 0; i <= num.length -1; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for(int j = num.length -1; j >= 0; j--){
            System.out.print(num[j] + " ");
        }
    }
}