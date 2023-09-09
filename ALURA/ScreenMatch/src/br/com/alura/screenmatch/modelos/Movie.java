package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calc.Rating;

/**
 *
 * @author Camila
 */
public class Movie extends Title implements Rating {
    private String director;

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
}
