package screenmatch;

/**
 *
 * @author Camila
 */
public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double sumGrades;
    private int totalGrades;
    int runningTime; 
    
    int getTotalGrades(){
        return totalGrades;
    }
    
    void displayTechnicalSpecifications(){
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Runtime: " + runningTime);
    }
    
    void rate(double grade){
        sumGrades += grade;
        totalGrades++;
    }
    
    double getAverageRating(){
        return sumGrades / totalGrades;
    }
        
}
