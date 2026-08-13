package br.ed.unicesumar;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadeAtual=0;
    }

    public void acelerar(){
        if(this.velocidadeAtual<=180){
            this.velocidadeAtual++;
        }
    }

    public void frear(){
        if(this.velocidadeAtual>=0){
            this.velocidadeAtual--;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}