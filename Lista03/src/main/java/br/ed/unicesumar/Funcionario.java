package br.ed.unicesumar;

public class Funcionario{
    private String nome;
    private String cargo;
    private Double salario;

    public Funcionario(String nome, String cargo, Double salario){
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario>0){
            this.salario = salario;
        }
    }
}