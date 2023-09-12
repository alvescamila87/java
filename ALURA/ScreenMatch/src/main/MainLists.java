package main;

import java.util.ArrayList;
import java.util.Collections;
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
         myMovie1.rate(9);
         var myMovie2 = new Movie("Forrest Gump", 1994);
         myMovie1.rate(9.8);
         var myMovie3 = new Movie("Radio Flyer", 1992);
         myMovie1.rate(9.2);
         var myMovie4 = new Movie("Ferris Bueller's Day Off", 1986);
         myMovie1.rate(9.1);
         
         var myTVShow = new TVShow("Breaking Bad", 2008);
         
         ArrayList<Title> listOfWatched = new ArrayList<>();
         listOfWatched.add(myMovie1);
         listOfWatched.add(myMovie2);
         listOfWatched.add(myMovie3);
         listOfWatched.add(myMovie4);
         listOfWatched.add(myTVShow);
         for (Title item: listOfWatched) {
             System.out.println(item.getName());
             if (item instanceof Movie movie && movie.getRate() > 2) {
                 System.out.println("Rating: " + movie.getRate());
             }
         }

//        listOfWatched.forEach(System.out::println);
       
            
        // Ordenando listas
        ArrayList<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Tom Hanks");
        searchForArtist.add("Morgan Freeman");
        searchForArtist.add("Matthew Broderick");
        searchForArtist.add("Bryan Cranston");
        searchForArtist.add("Elijah Wood");
        // Ordenando listas - Ordem de inclusão
        System.out.println("No sort: " + searchForArtist);
        
        // Ordenando listas A a Z - Collenctions sort
        Collections.sort(searchForArtist);
        System.out.println("Collection sort used: " + searchForArtist);
        
        // Ordenando títulos A a Z - Collenctions sort
        Collections.sort(listOfWatched);
        System.out.println("Collection sort used: " + listOfWatched);
    }
    
}
