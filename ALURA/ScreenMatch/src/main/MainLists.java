package main;

import java.util.ArrayList;
import patterns.Movie;
import patterns.TVShow;
import patterns.Title;

/**
 *
 * @author Camila
 */
public class MainLists {
    public static void main(String[] args) {
         var myMovie1 = new Movie("The Shawshank Redemption", 1994);
         var myMovie2 = new Movie("Forrest Gump", 1994);
         var myMovie3 = new Movie("Radio Flyer", 1992);
         var myMovie4 = new Movie("Ferris Bueller's Day Off", 1986);
         
         var myTVShow = new TVShow("Breaking Bad", 2008);
         
         ArrayList<Title> listOfWatched= new ArrayList<>();
    }
    
}
