package br.ed.unicesumar;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Escreva o seu nome: ");
        String nome=scanner.nextLine();
        System.out.println(nome);

        scanner.close();
    }
}