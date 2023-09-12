package calcs;

import patterns.Title;

/**
 *
 * @author Camila
 */
public class CalcOfTime {
    private int totalTime = 0;
    
    public int getTotalTime(){
        return this.totalTime;
    }
    
//    public void insert(Movie m) {
//        this.totalTime += m.getRunningTime();
//    }
//    
//    public void insert(TVShow t) {
//        this.totalTime += t.getRunningTime();
//    }
    
    public void insert(Title myTitle) {
        System.out.println("Adding running time in minutes from: " + myTitle);
        this.totalTime += myTitle.getRunningTime();
        
    }
    
}
