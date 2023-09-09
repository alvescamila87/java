package primeiroprojeto_screenmatch;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Loop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        double averageRating = 0;
        double rating = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("What is your rate to this movie?");
            rating = keyboard.nextDouble();
            averageRating += rating;
        }
        
        System.out.println("The average rating: " + averageRating / 3);
        
    }
         
}
