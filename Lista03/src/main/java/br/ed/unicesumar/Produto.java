package br.ed.unicesumar;

public class Produto{
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public void aplicarDesconto(Double percentual){
        this.preco/=percentual;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        if(preco>0){
            this.preco = preco;
        }
    }
}