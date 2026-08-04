package br.ed.unicesumar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    static void main(){ //public static void main(String[] args){}
        System.out.println("Hello world");

        Scanner scanner=new Scanner(System.in);

        try{
            System.out.print("Digite um numero: ");
            int numero=scanner.nextInt();
            System.out.println(numero);

            if(numero<0){
                System.out.println("Negativo");
            }else if(numero>0){
                System.out.println("Positivo");
            }else{
                System.out.println("Zero");
            }
        }catch(InputMismatchException e){
            System.out.println("Erro: Valor invalido");
        }

        for(int i=1;i<=10;i++){
            System.out.printf("%d ",i);
        }

        scanner.close();
    }
}