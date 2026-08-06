package Parte2;

import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {
    static void main(){
        //1
        Scanner scanner=new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra=scanner.nextLine();

        for(int i=palavra.length()-1; i>=0;i--){
            System.out.printf("%c",palavra.charAt(i));
        }

        //3
        System.out.println("");
        String senha="";
        do{
            System.out.print("Escreva uma senha de no minino 8 chars: ");
            senha=scanner.nextLine();

            if(senha.length()<8){
                System.out.println("A senha deve ter pelo menos 8 chars!");
            }
        }while(senha.length()<8);

        //4
        System.out.print("Escreva uma palavra: ");
        String palavra2=scanner.nextLine();

        if(palavra2.toLowerCase(Locale.ROOT).charAt(0)=='a'){
            System.out.println("A palavra começa com a");
        }else{
            System.out.println("A palavra não começa com a");
        }

        scanner.close();
    }
}