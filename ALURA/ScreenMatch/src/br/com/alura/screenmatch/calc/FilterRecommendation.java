package br.com.alura.screenmatch.calc;

/**
 *
 * @author Camila
 */
public class FilterRecommendation {

    public void filter(Rating myRating) {
        if (myRating.getRate() >= 4) {
            System.out.println("Name: " + myRating.getName() + ", its among the most watched at the moment.");
        } else if (myRating.getRate() >= 2) {
            System.out.println("Name: " + myRating.getName() + ", very well rated at the moment.");
        } else {
            System.out.println("Name: " + myRating.getName() + ", put it on your list to watch later.");
        }        
    }
    
}
