package br.com.alura.musicapp.modelos;

/**
 *
 * @author Camila
 */
public class Audio {
    private String title;
    private int duration;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    // método 1
    public void like() {
        this.totalLikes++;  
    }
    
    // método 2
    public void playTrack() {
        this.totalPlays++;
    }
}
