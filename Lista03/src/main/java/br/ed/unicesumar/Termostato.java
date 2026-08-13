package br.ed.unicesumar;

public class Termostato{
    private int temperaturaAtual;
    private int temperaturaDesejada;

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void setTemperaturaDesejada(int temperaturaDesejada) {
        if(temperaturaDesejada>=15&&temperaturaDesejada<=30){
            this.temperaturaDesejada = temperaturaDesejada;
        }
    }
}