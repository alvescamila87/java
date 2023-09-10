
package br.com.alura.musicapp.modelos;

/**
 *
 * @author Camila
 */
public class Single extends Audio {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist(String artist) {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    // Polimorifismo
    @Override
    public int getRating() {
        if (this.getTotalPlays() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
    
    
}
