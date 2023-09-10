package br.com.alura.musicapp.modelos;

/**
 *
 * @author Camila
 */
public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    // Polimorfismo
    @Override
    public int getRating() {
        if(this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
