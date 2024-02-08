import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyProgram
{
    public static void main(String[] args)
    {
        String filePath = "cereal.csv";
        Cereal[] cereals = Cereal.readCerealData(filePath);
       
      // add printed labels that explains every item that is outputted!
      System.out.println("ALL CEREAL NAMES: ");
      // use a for loop to print every cereal
      for(int i = 0; i > cereals.length; i++){
          System.out.println(cereals[i]);
      }
      System.out.println("--------------------------------------");
      // print out cereal info (call toString())
      for(Cereal cereal : cereals){
          System.out.println(cereal.toString());
      }
      System.out.println("--------------------------------------");
      System.out.println();
      
      // print the names of the cereals with highest rating - ratings > 61.5
      System.out.println("Cereals with the highest ratings: ");
      for(Cereal c : cereals){
          if(c.getRating() > 61.5){
              System.out.print(c.getName() + ", ");
          }
      }
      System.out.println();
      System.out.println("--------------------------------------");
      // print the names of the cereals that have less than 5g of sugar
      System.out.println("Cereals that have less than 5g of sugar: ");
      for(Cereal c1 : cereals){
          if(c1.getSugar() < 5){
              System.out.print(c1.getName() + ", ");
          }
      }
      
      // print the names of the cereals that have between 5 - 10g of sugar
      // include 5 and 10
      System.out.println();
      System.out.println("--------------------------------------");
      System.out.println("Cereals that have between 5 - 10g of sugar: ");
      for(Cereal c2 : cereals){
          if(c2.getSugar() >= 5 && c2.getSugar() <= 10){
              System.out.print(c2.getName() + ", ");
          }
      }
      // print the names of the cereals that have 10g+ of sugar
      System.out.println();
      System.out.println("--------------------------------------");
      int s = 0;
      System.out.println("cereals that have 10g+ of sugar: ");
      for(Cereal c3 : cereals){
          if(c3.getSugar() >= 10){
              System.out.print(c3.getName() + ", ");
              s++;
          }
      }
      // also count how many cereals have more than 10g of sugar 
      // print the number of cereals with more than 10g of sugar
      System.out.println("\n Number of cereals with more than 10g of sugar: " + s);
      System.out.println();
      System.out.println("--------------------------------------");
      // determine and print the average sugar content from all of the cereals
      System.out.println("Average sugar content: " + Cereal.getAverage(cereals));
      // print the names of cereals with 5 or more proteins
      for(Cereal c4 : cereals){
          if(c4.getProtein() >= 5){
              System.out.print(c4.getName() + ", ");
          }
      }
      System.out.println();
      System.out.println();
      System.out.println("--------------------------------------");
      // print the highest rated cereal's name and rating
      String highestName = "";
      double highestRating = 0.0;
      for(Cereal c5 : cereals){
          if(c5.getRating() > highestRating){
              highestRating = c5.getRating();
              highestName = c5.getName();
          }
      }
      System.out.println("Highest rated cereal's name: " + highestName + ", Rating: " + highestRating);
      // print the name of the cereal with the lowest calories
      System.out.println();
      int lowestCalories = 999999;
      String nameC = "";
      for(Cereal g : cereals){
          if(g.getCalories() < lowestCalories){
              lowestCalories = g.getCalories();
              nameC = g.getName();
          }
      }
      System.out.println();
      System.out.println("--------------------------------------");
      System.out.println("Lowest Calorie Name: " + nameC + ", Calories: " + lowestCalories);
      // Create your own algorithm 
      // add a comment to explain what you found
      // label and print your findings
      System.out.println();
      System.out.println();
      System.out.println("--------------------------------------");
      //Writing a program that find the cereal with the most fiber
      double maxFiber = 0.0;
      String fname ="";
      for(Cereal f : cereals){
          if(f.getFiber() > maxFiber){
              maxFiber = f.getFiber();
              fname = f.getName();
          }
      }
      System.out.println("Cereal with the most fiber: " + fname + ", Fiber: " + maxFiber);
    }
}