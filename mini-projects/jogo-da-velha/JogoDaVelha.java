public class JogoDaVelha{
public static void main(String[] args){
System.out.println(
"""

=============================
       JOGO DA VEIA
=============================

"""
);

TabuleiroTrans tabuleiro = new TabuleiroTrans('X');
tabuleiro.rodarJogo();
}
}
