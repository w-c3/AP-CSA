import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cereal {
    //write the remaining 13 private instance variables as defined below 
    // in the constructor
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;
    private double carbs;

  
    // Constructor for Cereal objects
    // Do NOT change anything in the Constructor
    public Cereal(String[] data) {
        name = data[0];
        type = data[1];
        try {
            calories = Integer.parseInt(data[2]);
            protein = Integer.parseInt(data[3]);
            fat = Integer.parseInt(data[4]);
            sodium = Integer.parseInt(data[5]);
            fiber = Double.parseDouble(data[6]);
            carbs = Double.parseDouble(data[7]);
            sugar = Integer.parseInt(data[8]);
            potassium = Integer.parseInt(data[9]);
            vitamins = Integer.parseInt(data[10]);
            shelf = Integer.parseInt(data[11]);
            weight = Double.parseDouble(data[12]);
            cups = Double.parseDouble(data[13]);
            rating = Double.parseDouble(data[14]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // Do NOT change anything in the readCerealData method
    public static Cereal[] readCerealData(String filePath) {
        Cereal[] cereals = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read the header line (and discard it)
            br.readLine();

            // Read the number of lines in the file to determine the array size
            long count = br.lines().count();
            cereals = new Cereal[(int) count];
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the file again and populate the array
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the header line
            br.readLine();

            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                cereals[index] = new Cereal(data);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cereals;
    }
    
    public String toString(){
        return "Name: " + this.getName() + "\nRating: " + this.getRating();
    }

  // overwrite the toString method to print cereal info
  // return a string that contains the cereal name and rating
  // label items Name: Cap'n'Crunch Rating: 18.042851 


    // Getters and other methods (if needed) go here
    public String getName(){
        return name;
    }
    public double getRating(){
        return rating;
    }
    public int getSugar(){
        return sugar;
    }
    public int getProtein(){
        return protein;
    }
    public int getCalories(){
        return calories;
    }
    public double getFiber(){
        return fiber;
    }
    // you only need to create getters for the values you need to use in main
    public static double getAverage(Cereal[] cereals){
        double totalS = 0;
        double tCereal = 0;
        for(Cereal a : cereals){
            totalS += a.getSugar();
            tCereal++;
        }
        return totalS/tCereal;
    }

}