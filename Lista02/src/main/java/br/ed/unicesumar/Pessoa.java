package br.ed.unicesumar;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void fazerAniversario(){
        this.idade++;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}