package estruturas_loop;

import java.util.Scanner;

public class While {

    public static void main(String args[]){
        String estadoCabelo = "Hidratado";
        Scanner entrada = new Scanner(System.in);

        //While - roda enquanto a condição dentro do parenteses for verdadeira 
        //equals - confere se o conteúdo dentro do parenteses é igual ao do objeto

        while (estadoCabelo.equals("Hidratado")){

            System.out.println("Que cabelo lindo e hidratado, já imagino ele como da última vez...");
            System.out.println("----------------------------");
            System.out.println("Como está o cabelo agora??");
            estadoCabelo = entrada.nextLine();
        } 

        System.out.println("O cabelo não está mais hidratado.");

        //Do - While é uma variante do while que executa o bloco uma vez antes da condição do while ser analisada
        do{
            System.out.println("Que cabelo lindo e hidratado, já imagino ele como da última vez...");
            System.out.println("----------------------------");
            System.out.println("Como está o cabelo agora??");
            estadoCabelo = entrada.nextLine();

        } while(estadoCabelo.equals("Hidratado"));

        entrada.close();

        
    }

}
