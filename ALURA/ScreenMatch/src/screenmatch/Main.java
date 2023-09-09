package screenmatch;

/**
 *
 * @author Camila
 */
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Shawshank Redemption";
        myMovie.releaseYear = 1994;
        myMovie.runningTime = 142;
        
        myMovie.displayTechnicalSpecifications();
        myMovie.rate(9.4);
        myMovie.rate(7.3);
        myMovie.rate(8.7);
        System.out.println("Total grades: " + myMovie.getTotalGrades());
        System.out.println(myMovie.getAverageRating());
    }
    
}
