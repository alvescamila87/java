package patterns;

import calcs.Rating;

/**
 *
 * @author Camila
 */
public class Movie extends Title implements Rating {
    private String director;

    // new constructor
    public Movie(String name, int releaseYear) {
        super (name, releaseYear);
    }

    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRate() {
        return (int) getTotalGrades() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")"; 
    }
    
    
    
}
