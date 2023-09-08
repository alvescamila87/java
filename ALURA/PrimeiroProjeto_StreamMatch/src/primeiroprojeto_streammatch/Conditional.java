package primeiroprojeto_streammatch;

/**
 *
 * @author Camila
 */
public class Conditional {
    public static void main(String[] args) {
        
        int releaseYear = 2022;
        boolean includedInThePlan = true;
        double rating = 8.1;
        String typePlan = "plus";
        
        if (releaseYear >= 2022) {
            System.out.println("Release movies that people are watching!");
        } 
        else {
            System.out.println("Retro movie worth watching.");
        }
        
        if (includedInThePlan == true || typePlan.equals("plus")) {
            System.out.println("Free movie");
        } else {
            System.out.println("You should pay the rent to watch this movie.");
        }
    }
    
}
