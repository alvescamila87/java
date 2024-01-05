package com.loiane.estruturadados.pilha.exercicios;

public class Livro {

    private String isbn;
    private String autor;
    private String titulo;
    private int anoLancamento;

    public Livro() {
        super();
    }

    public Livro(String isbn, String autor, String titulo, int anoLancamento) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                "} ";
    }
}
