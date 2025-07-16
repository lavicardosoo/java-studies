package tiposdados;

public class Operadores {
    public static void main(String args[]){

        byte n1 = 30;
        float n2 = 1.5f;
        float resultado;

        //-------Operadores Aritméticos---------

        // + soma
        resultado = n1 + n2;
        // - subtração
        resultado = n1 - n2;
        // / divisão
        resultado = n1 / n2;
        // * multiplicação
        resultado = n1 * n2;
        // % modulo ou resto da divisão
        resultado = n1 % n2;
        //++ incrementa + 1 e -- incrementa -1
        resultado = n1++;
        resultado = n2--;

        //-------Operadores Lógicos---------
        
        // && - E / And
        if (n1 == 2 && n2 == 3){
            resultado = 25;
        }

        // || - Ou / Or
        if (n1 == 2 || n1 == 3){
            resultado = 89;
        }

        // ! - Não / not
        if(n1 != n2){
            resultado = 900;
        }

        //-------Operador Ternário---------
        
        String result;

        result = n1 > n2 ? "Verdadeiro" : "Falso";

    }
}
