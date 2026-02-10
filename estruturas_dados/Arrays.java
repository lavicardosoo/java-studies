package estruturas_dados;

public class Arrays{
	public static void main(String[] args){

	//Declaração
	//Tipo[]  nome = {dado1,dado2}

	String[] nomes = {"Archangel","Kitty"};
	char[] letras = {'A','K'};
	int[] idades = {22,20};

	//Declaração com new 
	//Declara um array vazio com tamanho determinado
	String[] valores = new String[6]; //Tamanho de 6 valores

	//Como acessar
	String nome1 = nomes[0]; //Primeiro valor(Contagem começa a partir de 0)

	//Acessar o tamanho do Array
	System.out.println(letras.length); //Imprime o tamanho do array: 2

	//Trocar o adicionar um valor no array
	nomes[1] = "Froggy";
	valores[0] = "Seiscentos e sessenta e seis";

	//Acessar os dados por uma estrutura de loop
	//For Tradicional
	for(int i = 0;i < idades.length;i++){
		System.out.printf("Olá, seu nome é %s\ne sua idade é %d%n", nomes[i], idades[i]);
	};

	//For-Each
	for(String nome : nomes){
		System.out.println(nome);
	};

	//Arrays Multidimensionais 
	String[][] produtos = {{"Arroz","Feijão","Macarrão"},{"Sabão","Aguá Sanitária","Detergente"}};

	System.out.println("Produtos Alimentícios:");

	for(String produto : produtos[0]){
		System.out.printf("| %s |", produto);
	};
	}
}
