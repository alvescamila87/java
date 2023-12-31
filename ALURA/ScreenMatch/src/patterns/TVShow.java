package patterns;

/**
 *
 * @author Camila
 */
public class TVShow extends Title {
    private int season;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpidose;

    // Construtor 
    public TVShow(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpidose() {
        return minutesPerEpidose;
    }

    public void setMinutesPerEpidose(int minutesPerEpidose) {
        this.minutesPerEpidose = minutesPerEpidose;
    }
   
    @Override
    public int getRunningTime() {
        return season * episodesPerSeason * minutesPerEpidose;
    }
    
    @Override
    public String toString() {
        return "TVShow: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
