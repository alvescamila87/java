package primeiroprojeto_screenmatch;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Reading {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type your favorite movie: ");
        String movie = keyboard.nextLine();
               
        System.out.println("What is the release year? ");
        int releaseYear = keyboard.nextInt();
        
        System.out.println("What is your rate to this movie? ");
        double rating = keyboard.nextDouble();
                
        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
                        
        
        keyboard.close();
    }
    
}
