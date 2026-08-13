package br.ed.unicesumar;

public class ContaBancaria{
    private String titular;
    private Double saldo;
    private int numeroConta;

    public ContaBancaria(String titular, Double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public void depositar(Double quantidade){
        if(quantidade>=0){
            saldo+=quantidade;
        }
    }

    public void sacar(Double quantidade){
        if(quantidade<saldo){
            saldo-=quantidade;
        }
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}