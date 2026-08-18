package vitorlescola;

public class Pessoa {
    private String nome;
    private Cachorro cachorro;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public void adotar(Cachorro cachorro){
        this.cachorro=cachorro;
    }
}
