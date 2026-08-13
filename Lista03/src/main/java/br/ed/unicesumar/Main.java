package br.ed.unicesumar;

public class Main {
    static void main() {
        //1-2
        Pessoa pessoa=new Pessoa("",0);
        pessoa.setNome("Joao");
        pessoa.setIdade(100);
        System.out.printf("\nNome: %s\nIdade: %d\n",pessoa.getNome(),pessoa.getIdade());

        //3
        ContaBancaria contaBancaria=new ContaBancaria("a",1000.0);

        //4
        Funcionario funcionario=new Funcionario("a","b",10.0);
        funcionario.setSalario(-5.0);
        System.out.printf("\n%f\n",funcionario.getSalario());

        //5
        Aluno aluno=new Aluno("a",5,5);

        //6
        Produto produto=new Produto("a",5.0);

        //7
        Livro livro=new Livro("a","a");

        //8
        Termostato termostato=new Termostato();

        //9
        Usuario usuario=new Usuario();

        //10
        Carro carro=new Carro("a","a");
    }
}