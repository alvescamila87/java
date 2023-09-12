package main;

import calcs.CalcOfTime;
import calcs.FilterRecommendation;
import patterns.Episode;
import patterns.Movie;
import patterns.TVShow;
import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class Main {
    public static void main(String[] args) {
//        Movie myMovie1 = new Movie();
//        myMovie1.setName("The Shawshank Redemption");
//        Movie myMovie1 = new Movie("The Shawshank Redemption");
//        myMovie1.setReleaseYear(1994);
        var myMovie1 = new Movie("The Shawshank Redemption", 1994);
        myMovie1.setRunningTime(142);
        System.out.println("Running time: " + myMovie1.getRunningTime());
        
        myMovie1.displayTechnicalSpecifications();
        myMovie1.rate(9.4);
        myMovie1.rate(7.3);
        myMovie1.rate(8.7);
        System.out.println("Total grades: " + myMovie1.getTotalGrades());
        System.out.println(myMovie1.getAverageRating());
        
//        TVShow myTVShow = new TVShow();
//        myTVShow.setName("Breaking Bad");
//        myTVShow.setReleaseYear(2008);
        var myTVShow = new TVShow("Breaking Bad", 2008);
        myTVShow.displayTechnicalSpecifications();
        myTVShow.setSeason(5);
        myTVShow.setEpisodesPerSeason(7);
        myTVShow.setMinutesPerEpidose(50);
        System.out.println("Running time: " + myTVShow.getRunningTime() + " minutes.");
        
//        Movie myMovie2 = new Movie();
//        myMovie2.setName("Forrest Gump");
//        Movie myMovie2 = new Movie("Forrest Gump");
//        myMovie2.setReleaseYear(1994);
        var myMovie2 = new Movie("Forrest Gump", 1994);
        myMovie2.setRunningTime(142);
        
        CalcOfTime myCalc = new CalcOfTime();
        myCalc.insert(myMovie1);
        myCalc.insert(myMovie2);
        myCalc.insert(myTVShow);
        System.out.println(myCalc.getTotalTime());
        
        FilterRecommendation myFilter = new FilterRecommendation();
        myFilter.filter(myMovie1);
        
        Episode myEpisode = new Episode();
        myEpisode.setNumber(1);
        myEpisode.setSerie(myTVShow);
        myEpisode.setTotalViews(300);
        myFilter.filter(myEpisode);
        
        // New Movie
//        var myMovie3 = new Movie();
//        myMovie3.setName("Radio Flyer");
//        myMovie3.setReleaseYear(1992);
        var myMovie3 = new Movie("Radio Flyer", 1992);
        myMovie3.setRunningTime(114);                
        myMovie3.rate(10);
        
        // Arraylist
        ArrayList<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(myMovie1);
        listOfMovies.add(myMovie2);
        listOfMovies.add(myMovie3);
        System.out.println("Length list: " + listOfMovies.size());
        System.out.println("First movie: " + listOfMovies.get(2).getName());
        System.out.println(listOfMovies);
        System.out.println(listOfMovies.toString());
        System.out.println("First movie: " + listOfMovies.get(2).toString());
        System.out.println(myMovie1.toString());
        
        // Constructor        
        var myMovie4 = new Movie("Ferris Bueller's Day Off", 1986);
    }
    
}
