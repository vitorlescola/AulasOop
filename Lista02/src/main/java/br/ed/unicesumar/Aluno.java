package br.ed.unicesumar;

public class Aluno {
    private int id;
    private String nome;
    private int nota1;
    private int nota2;
    private int media;

    public Aluno(String nome, int nota1, int nota2){
        this.nome=nome;
        this.nota1=nota1;
        this.nota2=nota2;
    }

    public int calcularMedia(){
        media=(nota1+nota2)/2;
        return media;
    }

    public Boolean verificarAprovacao(){
        if(media>=70){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}