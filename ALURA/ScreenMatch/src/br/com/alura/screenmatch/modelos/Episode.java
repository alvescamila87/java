package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calc.Rating;

/**
 *
 * @author Camila
 */
public class Episode implements Rating {
    private int number;
    private String name;
    private TVShow serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
   
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TVShow getSerie() {
        return serie;
    }

    public void setSerie(TVShow serie) {
        this.serie = serie;
    }

    @Override
    public int getRate() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
    
}
