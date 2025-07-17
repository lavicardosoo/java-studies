package estruturas_controle;
import java.util.Scanner;

public class Condition {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]){
        //--------ESTRUTURAS CONDICIONAIS---------

        System.out.println("VOCÊ QUER VER SOBRE o MATH???? digite 1 ou 2");

        byte pergunta = entrada.nextByte();

        //Primeira Condição
        if(pergunta == 1){

            System.out.println("=======TESTANDO O MATH(VAMOS USAR SOMENTE O NÚMERO -64 e 10 COMO BASE)=======");
            System.out.println("\n1 - VER RAIZ QUADRADA\n2- VER QUAL O MAIOR\n3-ESCOLHER NÚMERO ALEATÓRIO\n4-VER O VALOR ABSOLUTO DE UM NÚMERO\n");

            byte perguntaMath = entrada.nextByte();
            double n1 = 1;
            String resposta = "Você não digitou nada meu anjo!";
            
            switch (perguntaMath) {
                case 1:
                    n1 = Math.sqrt(10);
                    resposta = "A raiz quadrada de 10 é %-9.2f";
                    break;
                case 2:
                    n1 = Math.max(-64,10);
                    resposta = "O maior é %-2.0f";
                    break;

                case 3:
                    n1 = Math.random();
                    resposta = "O número aleatório escolhido foi %-9.2f";
                    break;

                case 4:
                    n1 = Math.abs(-64);
                    resposta = "O valor absoluto de -64 é %-2.0f";
                    break;
            }

            System.out.printf(resposta,n1,"\n");
        }
        
        //Roda se a condição anterior for falsa
        else if (pergunta == 2){
            System.out.println("pois então smt");
        }

        //Roda se nenhuma das outras condições forem verdadeiras
        else {
            System.out.println("Você não saber ler não???é pra responder 1 ou 2...");
        }
        


        
    }
}
