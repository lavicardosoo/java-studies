package estruturas_loop;

public class For {
    public static void main(String args[]){

        //Primeira Instrução (int cont = 0) => Roda 1 vez antes do bloco for ser executado.
        //Segunda Instrução (cont < 10) => Condição que vai definir quantas vezes o bloco será executado;
        //Terceira Instrução (cont ++) => É executado sempre que o bloco for rodar;


        for(int cont = 0;cont <= 10;cont++){
            System.out.printf("\n-----O loop executou este código %d vezes-------\n", cont);
        }
    }
}
