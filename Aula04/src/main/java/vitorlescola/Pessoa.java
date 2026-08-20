package vitorlescola;

public class Pessoa {
    private String nome;
    private Cachorro pet;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public void adotar(Cachorro pet){
        this.pet=pet;
    }
}