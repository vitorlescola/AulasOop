package br.ed.unicesumar;

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;

    public Aluno(String nome, int nota1, int nota2){
        this.nome=nome;
        this.nota1=nota1;
        this.nota2=nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota1(int nota1) {
        if(nota1>=0){
            this.nota1 = nota1;
        }
    }

    public void setNota2(int nota2) {
        if(nota2>=0){
            this.nota2 = nota2;
        }
    }
}