/*  Programmer: Will Coyne
    Date: 9/25/2023
    Description: The program prints out different movies title, 
    director, rating, and if the movie is in theaters or not. The 
    output puts out an example of using the movie class, and demonstrates
    an understanding of how to use objects, classes, and methods.

*/


public class MyProgram
{
    public static void main(String[] args)
    {
        //Creates the movie objects
        Movie movie1 = new Movie("Surfs Up", "Ash Brennan",10.0);
        Movie movie2 = new Movie("Finding Nemo","Andrew Stanton",5.5);
        Movie movie3 = new Movie("Bee Movie");
        Movie movie4 = new Movie("Cars 2");
        
        //Returns the rating of the second object
        System.out.println("Movie 2 rating: " + movie2.getRating());
        //Changes rating of the second object
        movie2.setRating(4.5);
        //Call the getter to print the director for first object
        System.out.println("Movie 1 director: " + movie1.getDirector());
        //Uses Setter to change inTheaters value for 3rd object
        movie3.setInTheaters(true);
        
        //Printing each object
        System.out.println();
        System.out.println("Movie 1 info: ");
        movie1.printMovieInfo();
        System.out.println("Movie 2 info: ");
        movie2.printMovieInfo();
        System.out.println("Movie 3 info: ");
        movie3.printMovieInfo();
        System.out.println("Movie 4 info: ");
        movie4.printMovieInfo();
        
    }
}