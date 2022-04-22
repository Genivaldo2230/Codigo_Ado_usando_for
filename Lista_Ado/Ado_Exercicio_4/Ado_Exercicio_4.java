package Lista_Ado;

/*  EXERCÍCIO #04
Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos.
 */

import java.util.Scanner;

public class Ado_Exercicio_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite Num: ");
        double N, soma = 0.0, media;
        int c = 0;

        for (int i = 0; i < 6; i++) {
            N = input.nextDouble();
            if (N > 0.0) {
                c++;
                soma += N;
            }
        }
        media = soma / c;
        System.out.println(c + " valores positivos");
        System.out.println("A media è: " + media);
    }


}