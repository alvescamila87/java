
package br.com.alura.musicapp.modelos;

/**
 *
 * @author Camila
 */
public class MyFavorites {
    
    public void insert(Audio audio) {
        if (audio.getRating() >= 8) {
            System.out.println(audio.getName() + " Classification: Top global"); 
        } else {
            System.out.println(audio.getName() + " Classification: Good option!");
        }
    }
    
}
