package br.com.alura.screenmatch.calc;

/**
 *
 * @author Camila
 */
public class FilterRecomendation {

    public void filter(Rating myRating) {
        if (myRating.getRate() >= 4) {
            System.out.println("Its among the most watched at the moment.");
        } else if (myRating.getRate() >= 2) {
            System.out.println("Very well rated at the moment.");
        } else {
            System.out.println("Put it on your list to watch later.");
        }        
    }
    
}
