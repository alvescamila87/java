package primeiroprojeto_screenmatch;

/**
 *
 * @author Camila
 * primeiro projeto alura 
 * projeto stream match (filmes)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is the Screen Match!");
        System.out.println("Movie: Top Gun: Maverick");
        
        int releaseYear = 2022;
        System.out.println("Release year: " + releaseYear);
        boolean includedInThePlan = true;
        double rating = 8.1;
        
        // Average calc
        double averageRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(averageRating);
        
        String synopsis = """
                          Maverick is still pushing the envelope as a top naval aviator 
                          """ + releaseYear;
        System.out.println(synopsis);
       
        
    }
    
}
