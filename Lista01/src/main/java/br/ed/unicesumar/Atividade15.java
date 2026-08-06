package br.ed.unicesumar;

import java.util.Scanner;

public class Atividade15{
    static void main(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Escreva sua senha:" );
        String senha=scanner.nextLine();

        if(senha.equals("1234")){
            System.out.println("Seja bem vindo!");
        }else{
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
