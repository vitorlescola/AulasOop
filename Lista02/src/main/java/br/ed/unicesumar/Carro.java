package br.ed.unicesumar;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    public void exibirDados(){
        System.out.printf("Marca:%s\nModelo:%s\nAno:%d\n",marca,modelo,ano);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}