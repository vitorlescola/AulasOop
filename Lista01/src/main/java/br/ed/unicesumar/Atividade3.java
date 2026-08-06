package br.ed.unicesumar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade3{
    public static void main(){
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.printf("Escreva o numero: ");
            int numero=scanner.nextInt();

            if(numero%2==0){
                System.out.println("Par!");
            }else{
                System.out.println("Impar!");
            }
        }catch(InputMismatchException e){
            System.out.println("Error: Valor invalido!");
        }

        scanner.close();
    }
}