package br.ed.unicesumar;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private int qtdPortas;

    public Veiculo(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.qtdPortas=2;
    }

    public void exibirDados(){
        System.out.printf("Marca:%s\nModelo:%s\nAno:%d\nQuantidade de portas:%d",marca,modelo,ano,qtdPortas);
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

    public int getQtdPortas() {
        return qtdPortas;
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

    public void setQtdPortas(int qtdPortas) {
        if(qtdPortas==4||qtdPortas==8){
            this.qtdPortas = qtdPortas;
        }
    }
}