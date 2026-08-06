package br.ed.unicesumar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.printf("Escreva o primeiro numero: ");
            int primeiroNumero=scanner.nextInt();

            System.out.printf("Escreva o segundo numero: ");
            int segunfoNumero=scanner.nextInt();

            System.out.println(primeiroNumero+segunfoNumero);
        }catch(InputMismatchException e){
            System.out.println("Error: Valor invalido!");
        }

        scanner.close();
    }
}