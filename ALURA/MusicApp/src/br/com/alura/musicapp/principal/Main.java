
package br.com.alura.musicapp.principal;

import br.com.alura.musicapp.modelos.MyFavorites;
import br.com.alura.musicapp.modelos.Podcast;
import br.com.alura.musicapp.modelos.Single;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Single sing1 = new Single();
        sing1.setName("What's up?");
        sing1.setAlbum("Bigger, Btter, Faster, More!");
        sing1.setArtist("4 Non Blondes");
        sing1.setDuration(295);
        
        for (int i = 0; i < 1000; i++) {
            sing1.playTrack();
        }
        
        for (int i = 0; i < 50; i++) {
            sing1.like();            
        }
        
        Podcast podcast1 = new Podcast();
        podcast1.setName("Grandes lídes na História = César, Justiniano e Carlos Magno");
        podcast1.setHost("Guilherme Freire");
        podcast1.setDuration(57);
        podcast1.setDescription("Um comentário sobre alguns dos maiores líderes da história.");
        
        for (int i = 0; i < 5000; i++) {
            podcast1.playTrack();            
        }
        
        for (int i = 0; i < 1000; i++) {
            podcast1.like();            
        }
        
        MyFavorites favorites = new MyFavorites();
        favorites.insert(sing1);
        favorites.insert(podcast1);
        
        
    }
    
}
