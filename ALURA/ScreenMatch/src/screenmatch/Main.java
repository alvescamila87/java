package screenmatch;

import br.com.alura.screenmatch.calc.CalcOfTime;
import br.com.alura.screenmatch.calc.FilterRecomendation;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.TVShow;

/**
 *
 * @author Camila
 */
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Shawshank Redemption");
        myMovie.setReleaseYear(1994);
        myMovie.setRunningTime(142);
        System.out.println("Running time: " + myMovie.getRunningTime());
        
        myMovie.displayTechnicalSpecifications();
        myMovie.rate(9.4);
        myMovie.rate(7.3);
        myMovie.rate(8.7);
        System.out.println("Total grades: " + myMovie.getTotalGrades());
        System.out.println(myMovie.getAverageRating());
        
        TVShow myTVShow = new TVShow();
        myTVShow.setName("Breaking Bad");
        myTVShow.setReleaseYear(2008);
        myTVShow.displayTechnicalSpecifications();
        myTVShow.setSeason(5);
        myTVShow.setEpisodesPerSeason(7);
        myTVShow.setMinutesPerEpidose(50);
        System.out.println("Running time: " + myTVShow.getRunningTime() + " minutes.");
        
        Movie myMovie2 = new Movie();
        myMovie2.setName("Forrest Gump");
        myMovie2.setReleaseYear(1994);
        myMovie2.setRunningTime(142);
        
        CalcOfTime myCalc = new CalcOfTime();
        myCalc.insert(myMovie);
        myCalc.insert(myMovie2);
        myCalc.insert(myTVShow);
        System.out.println(myCalc.getTotalTime());
        
        FilterRecomendation myFilter = new FilterRecomendation();
        myFilter.filter(myMovie);
        
        Episode myEpisode = new Episode();
        myEpisode.setNumber(1);
        myEpisode.setSerie(myTVShow);
        myEpisode.setTotalViews(300);
        myFilter.filter(myEpisode);
        
    }
    
}
