public class MyProgram1
{
	public static double[] timesTen(double[] arr)
	{
		for(int i = 0; i < arr.length; i++){
		    arr[i] = arr[i]*10;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		double[] array = {10.5, 20.0, 30.5, 40.2, 50.1, 60.0, 65.3, 70.2, 70.6, 80.6};
        timesTen(array);
        for(int x =0; x < array.length; x=x+2){
            System.out.println(array[x]);
        }
	}
}