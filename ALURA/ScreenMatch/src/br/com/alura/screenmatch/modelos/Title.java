package br.com.alura.screenmatch.modelos;

/**
 *
 * @author Camila
 */
public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumGrades;
    private int totalGrades;
    private int runningTime; 
    
    public int getTotalGrades(){
        return totalGrades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getRunningTime() {
        return runningTime;
    }
   
    public void displayTechnicalSpecifications(){
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Runtime: " + runningTime);
    }
    
    public void rate(double grade){
        sumGrades += grade;
        totalGrades++;
    }
    
    public double getAverageRating(){
        return sumGrades / totalGrades;
    }

    public String getName() {
        return name;
    }
    
    
}
