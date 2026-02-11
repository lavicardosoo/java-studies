import java.util.Scanner;

class TabuleiroTrans{

//Gráfico do jogo
//Cada array representa uma linha do gráfico
//Cada um ' ' representam uma coordenada do gráfico
private char[][] grafico = {
{' ',' ',' '},
{' ',' ',' '},
{' ',' ',' '}
};

private Scanner input;
private char gaymer;
private String nomeFofinho;
private String resposta;
private String modelo = "[ABC][123]";
private int[] coordenadas;

public TabuleiroTrans(char gaymer){
	this.gaymer = gaymer;
	this.input = new Scanner(System.in);
}

//Desenhar Tabuleiro
//🐸 🐱

private void desenharTabuleiro(){
	System.out.println(
	"""

	=================================================
	    A   B   C
	"""
	);

	for(int i = 0;i < 3;i++){

		System.out.print(i + 1  + " ");

		for(int c = 0;c < 3;c++){

			String simbolo = " ";

			switch(this.grafico[i][c]){
				case 'X':
					simbolo = "🐱";
					break;
				case 'O':
					simbolo = "🐸";
					break;
				case ' ':
					simbolo = "  ";
					break;
			}

			System.out.print(" " + simbolo + " ");
			if(c < 2) System.out.print("|");
		}

		System.out.println();
		if(i < 2 )System.out.println("==================");
	}

	System.out.println(
	"""

	=================================================
	""");

}
//Converter Posição
private int[] converterPosicao(){
	int coluna = this.resposta.charAt(0) - 'A';
	int linha = Character.getNumericValue(this.resposta.charAt(1)) - 1;

	return new int []{coluna,linha};
}
//Verificar Vitória
private boolean verificarVitoria(){
	for(int i = 0; i < this.grafico.length;i++){
		if(this.grafico[i][0] == this.gaymer &&
		   this.grafico[i][1] == this.gaymer &&
		   this.grafico[i][2] == this.gaymer ||
		   this.grafico[0][i] == this.gaymer &&
		   this.grafico[1][i] == this.gaymer &&
		   this.grafico[2][i] == this.gaymer
		){
			return true;
		}
	}
	if(this.grafico[0][0] == this.gaymer &&
	   this.grafico[1][1] == this.gaymer &&
	   this.grafico[2][2] == this.gaymer ||
	   this.grafico[0][2] == this.gaymer &&
	   this.grafico[1][1] == this.gaymer &&
	   this.grafico[2][0] == this.gaymer
	){
			return true;
	}

	return false;
}

//Tabuleiro está Lotadeee
private boolean tabuleiroLotado(){
	for(char[] arrays : this.grafico ){
		for(char espaco : arrays){
			if(espaco == ' '){
				return false;
			}
		}
	}
	return true;
}

//Roda o Jogo

public void rodarJogo(){
	while(true){

		this.desenharTabuleiro();
		this.nomeFofinho = (this.gaymer == 'X') ? "Gatinho🐱" : "Sapinho🐸";
		System.out.println("\n=>Vez do jogador " + this.nomeFofinho + "\n");
		System.out.print("Faça sua jogada!\nDigite uma coordenada, veyr:");
		this.resposta = input.nextLine().toUpperCase();

		if(!this.resposta.matches(this.modelo)){
			System.out.println(
			"""

			-------------------------------------------
			Moça, a coordenada precisa ser nesse modelo:
			""" 
			+ "=>" + this.modelo +
			"""

			=>Sua burra🙄
			-------------------------------------------
			"""
			);
			continue;
		}

		this.coordenadas = this.converterPosicao();
		int linha = this.coordenadas[1];
		int coluna = this.coordenadas[0];

		
		if(this.grafico[linha][coluna] != ' '){
  			System.out.println(
			"""

			!!!!!!!!!!!!!!!!!!!!!!!!!!

			""");
			System.out.println("Olá, essa coordenada já está preenchida! Escolha outra...");
  			System.out.println(
			"""

			!!!!!!!!!!!!!!!!!!!!!!!!!!

			""");
			continue;
		}

		this.grafico[linha][coluna] = this.gaymer;
		
		if(this.verificarVitoria()){
			this.desenharTabuleiro();
			System.out.printf("\nO jogador %s ganhou!!\n", this.nomeFofinho);
			break;
		}
			
		else if(this.tabuleiroLotado()){
  			System.out.println(
			"""

			!!!!!!!!!!!!!!!!!!!!!!!!!!

			""");
			System.out.println("O tabuleiro está lotado, nem ganharam, nem perderam! Parabéns seus burros.");
  			System.out.println(
			"""

			!!!!!!!!!!!!!!!!!!!!!!!!!!

			""");
			break;
		}
			
		else {
			this.gaymer = (this.gaymer == 'X') ? 'O' : 'X';
		}
	}

}
}
