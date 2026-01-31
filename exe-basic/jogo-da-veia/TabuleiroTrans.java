import java.util.Scanner;

class TabuleiroTrans{

//Gráfico do jogo
//Cada array armazena uma linha do jogo
//Cada ' ' armazena uma coordenada do jogo
private char[][] grafico = 
{
{' ',' ',' '},
{' ',' ',' '},
{' ',' ',' '}
};
/**private char[][] grafico = 
{
{'O','X','O'},
{'O','X','X'},
{'X','X','X'}
};**/

public Scanner input;
private char gaymer;
private String posicaoFavorita;
private String resposta;
private String modelo = "[ABC][123]";
private int[] coordenadas;


public TabuleiroTrans(char gaymer){
	this.gaymer = gaymer;
	this.input = new Scanner(System.in);
}

private void desenharTabuleiro(){
	System.out.println(
	"""
	==========================
	    🅰       🅱       🅲
	""");
	String[] numerosTrans = {"➊","➋","➌"};

	for(int i = 0;i < 3;i++){
		System.out.print(numerosTrans[i] + " ");

		for(int c = 0;c < 3;c++){

			String simbolo = " ";

			switch(this.grafico[i][c]){
			case 'O':
				simbolo = " 🐸";
				break;
			case 'X':
				simbolo = " 🐱";
				break;
			case ' ':
				simbolo = "  ";
				break;
			}
		System.out.print(" " + simbolo + " ");
		if(c < 2) System.out.print(" | ");	
		}
		System.out.println();
		if(i < 2) System.out.println(" --------------------");
	}
	
	System.out.println(
	"""
	
	==========================
	
	""");
}

private int[] converterPosicao(){

	int coluna = this.resposta.charAt(0) - 'A';
	int linha = Character.getNumericValue(this.resposta.charAt(1)) - 1;

	return new int []{linha,coluna};
}

private boolean verificarVitoria(){

	int contadorCis = 0;
	for(char[] linha:this.grafico){
		if(linha[0] == this.gaymer && linha[1] == this.gaymer && linha[2] == this.gaymer ||
		   this.grafico[0][contadorCis] == this.gaymer && this.grafico[1][contadorCis] == this.gaymer && this.grafico[2][contadorCis] == this.gaymer
		){
			return true;
		}
		contadorCis += 1;
	}
	if(this.grafico[0][0] == this.gaymer && this.grafico[1][1] == this.gaymer && this.grafico[2][2] == this.gaymer ||
	this.grafico[0][2] == this.gaymer && this.grafico[1][1] == this.gaymer && this.grafico[2][0] == this.gaymer
	){
		return true;
	}

	return false;
}

private boolean tabuleiroLotade(){
	for(char[] linha:this.grafico){
		for(char valor:linha){
			if(valor == ' '){
				return false;
			}
		}
	}
	return true;
}

public void rodarJogo(){
	while(true){
		this.desenharTabuleiro();
		this.posicaoFavorita = (this.gaymer == 'O') ? "sapinho 🐸" : "gatinho 🐱";
		System.out.println("Vez do jogador " + this.posicaoFavorita + "\n");
		System.out.print("Digite a coordenada, veyr:");
		this.resposta = input.nextLine().toUpperCase();
	
		if(!this.resposta.matches(this.modelo)){
			System.out.println("""

			****************************************************
			"""
			);
			System.out.println("Moça, a coordenada precisa ser nesse modelo:" + this.modelo);
			System.out.println("""

			****************************************************
			"""
			);
			continue;
		}

		this.coordenadas = converterPosicao();
		int linha = this.coordenadas[0];
		int coluna = this.coordenadas[1];

		if(this.grafico[linha][coluna] != ' '){
			System.out.println("Amiga...Já estão nessa posição, burrinha!");
			continue;
		}

		this.grafico[linha][coluna] = this.gaymer;

		if(this.verificarVitoria()){
			this.desenharTabuleiro();
			System.out.println("Alguém ganhou!!!");
			break;
		}else if (this.tabuleiroLotade()){
			System.out.println("Ops...Deu velha, nem ganharam nem perderam. Seus burros.");
			break;
		}else{
			this.gaymer = (this.gaymer == 'X') ? 'O':'X';
		}


	}
}
}
