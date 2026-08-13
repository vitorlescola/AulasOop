package br.ed.unicesumar;

public class Livro {
    private String titulo;
    private String autor;
    private Boolean disponivel;

    public Livro(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.disponivel=true;
    }

    public void emprestar(){
        this.disponivel=false;
    }

    public void devolver(){
        this.disponivel=true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}