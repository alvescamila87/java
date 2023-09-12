package calcs;

/**
 *
 * @author Camila
 */
public class FilterRecommendation {

    public void filter(Rating myRating) {
        if (myRating.getRate() >= 4) {
            System.out.println("Its among the most watched at the moment.");
        } else if (myRating.getRate() >= 2) {
            System.out.println("very well rated at the moment.");
        } else {
            System.out.println("Put it on your list to watch later.");
        }        
    }
    
}
