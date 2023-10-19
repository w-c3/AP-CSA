public class Movie {
    //Instance Variables
    private String title;
    private String director;
    private double rating;
    private boolean inTheaters;
    
    //Parameterized contructor that takes three parameters
    public Movie(String initTitle,String initDirector, double initRating){
        title = initTitle;
        director = initDirector;
        rating = initRating;
    }
    //Second Constructor
    public Movie(String initTitle){
        title = initTitle;
        director = "unknown";
        rating = 0.0;
        inTheaters = false;
    }
    
    //Method for outputting movie info
    public void printMovieInfo(){
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("In Theaters: " + inTheaters);
        System.out.println();
    }
    //getter method for getting title
    public String getTitle(){
        return title;
    }
    //getter method for getting director
    public String getDirector(){
        return director;
    }
    //getter method for getting rating
    public double getRating(){
        return rating;
    }
    //getting method for getting inTheaters
    public boolean getInTheaters(){
        return inTheaters;
    }
    //setting method to change inTheaters 
    public void setInTheaters(boolean a){
        inTheaters = a;
    }
    //setting method to change rating
    public void setRating(double a){
        rating = a;
    }
}