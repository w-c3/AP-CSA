public class MyProgram2
{
    public static void main(String[] args)
    {
        int[] scores = {82, 95, 98, 78, 84};
        
        System.out.println("** Original Values **");
        //Print the values of score using an Enhanced For Loop
        for (int score : scores){
            System.out.println(score);
        }
        
        
        //Print blank line in between
        System.out.println();
        
        // Attempt to add 8 in Enhanced For Loop
        //for (int s : scores){
       //       scores = scores +8;
       // }
       
        
        System.out.println("** Adding in a Enhanced For Loop **");
        //Re-print the values of score using an Enhanced For Loop
        for (int score8 : scores){
            System.out.println(score8);
        }




        //Print blank line in between
        System.out.println();
        
        // Attempt to add 8 in Standard For Loop
        for(int i = 0; i < scores.length; i++){
            scores[i] = scores[i] + 8;
        }
  
  
      
        System.out.println("** Adding in a Standard For Loop **");
        //Re-print the values of score
       for(int j = 0; j < scores.length; j++){
            System.out.println(scores[j]);
        }
       
       
       
        System.out.println();
    }
}