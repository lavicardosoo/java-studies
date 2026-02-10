import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class LojaTrans {

    /*
     * Métodos:Funções e Procedimentos
     * Procedimentos - Exercem uma ação sem a necessidade de um retorno
     * Funções - Retornam algo(Precisam ter a tipagem do retorno na declaraçãok)
     */

    static ArrayList<String> nomeProdutos = new ArrayList<>(Arrays.asList("Cropped", "Vestido", "Eyelashes"));
    static ArrayList<Float> precoProdutos = new ArrayList<>(Arrays.asList(15f,999f, 85.99f));
    static ArrayList<Integer> estoqueProdutos  = new ArrayList<>(Arrays.asList(5,3,1));
    static float saldo = 666f;
    static Scanner escreva = new Scanner(System.in);

    static void mostrarProdutos(){
        System.out.printf("%-15s %-10s %-10s%n", "|Produto|", "|Preço|", "|Quant|");
        System.out.println("-------------------------------------------");
        for(int c = 0; c < nomeProdutos.size(); c++){

            System.out.printf("%-15s R$%-9.2f %-10d%n",nomeProdutos.get(c),precoProdutos.get(c),estoqueProdutos.get(c));
        }
    }
    static void venderProduto(){
        System.out.println("Digite o nome do produto!!");
        System.out.println("Digita certinho sua vadia, aqui n tem validação");

        escreva.nextLine();
        String produto = escreva.nextLine();

        for(String p : nomeProdutos){
            int index = nomeProdutos.indexOf(p);
            if(p.equals(produto)){
                saldo += precoProdutos.get(index);
                estoqueProdutos.set(index, estoqueProdutos.get(index) - 1);
            }
        }

        System.out.println("Seu novo saldo é R$" + saldo);
    }
    static void gerarProduto(){

        System.out.println("Escreva o nome do produto");
        escreva.nextLine();
        String nome = escreva.nextLine();
        Boolean signed = nomeProdutos.contains(nome);

        if(signed){
            System.out.println("\n ESSE PRODUTO JÁ ESTÁ CADASTRADO SUA ANTA!!!");
        }else {
            System.out.println("\nDigite um valor para o produto");
            float preco = escreva.nextInt();

            nomeProdutos.add(nome);
            precoProdutos.add(preco);
            estoqueProdutos.add(1);

            System.out.println("\nProduto criado com sucesso! Seu Produto" + nome + " Vai vender muitooo com esse valor de R$" + preco);
        }

    }
    static void mostrarOpcoes(){
        while (true) {
            System.out.println("\nESCOLHA UMA OPÇÃO:\n 1 - Gerar Produto \n 2 - Vender Produto \n 3 - Mostrar Produtos\n");
            int opc = escreva.nextInt();
            switch (opc) {
                case 1:
                    gerarProduto();
                    break;
                case 2:
                    venderProduto();
                    break;
                case 3:
                    mostrarProdutos();
                    break;
            }
        }
    }
    public static void main(String[] args){
        mostrarOpcoes();
    }
}
