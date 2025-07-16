package tiposdados;

public class DataTypes {
    public static void main(String args[]){
        //String - Armazena sequências de caractéres
        String nome = "Juju";

        //Chars - Armazena um único caractére(Funciona somente com '')
        char tipoSanguineo = 'B';

        //Byte - Armazena números de -128 à 127
        byte idade = 12;

        //Short - Armazena números de -32768 à 32767:
        short precoMoto = 20000;

        //Int - Armazena números de -2147483648 à 2147483647
        int precoCasa = 28000000;

        //Long - Armazena números de -9223372036854775808 à 9223372036854775807(Deve se utilizar l como medida)
        long numPessoasTerra =  8062000000l;

        //Float - Armazena números decimais com até 7 dígitos(É necessário utilizar o f como medida)
        float altura = 1.2f;

        //Double - Armazena números decimais com até 16 dígitos(Precisa usar o d como medida)
        double kmTerraParaSol = 152.050000d;
    }
}