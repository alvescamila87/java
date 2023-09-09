
package primeiroprojeto_screenmatch;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class LoopWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        double averageRating = 0;
        double rating = 0;
        int totalRating = 0;
                
        while(rating != 999) {
            System.out.println("Type your rate to this movie or 999 to stop: ");
            rating = keyboard.nextDouble();
            
            if (rating != 999) {
              averageRating += rating;
                totalRating++;  
            }
            
        }
        if (totalRating == 0) {
                System.out.println("It is NOT possible to divide total rating by ZERO.");
                        
        } else {
            
            System.out.println("The average rating: " + averageRating / totalRating);
        }
        
    }
         
}