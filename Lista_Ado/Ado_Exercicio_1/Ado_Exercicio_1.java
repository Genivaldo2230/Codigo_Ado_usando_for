package Lista_Ado;
/*
  EXERCÍCIO #01 ADO
Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
*
* @author gda_a
 */

public class Ado_Exercicio_1 {
    public static void main(String[] args) {
        System.out.println("Numeros pares!! ");

        int i = 0;

        for(i = 0; i <=100; i++){
            if (i % 2 == 0){
                System.out.printf("%d:Nun Pares\n", i);
            }

        }

    }
}