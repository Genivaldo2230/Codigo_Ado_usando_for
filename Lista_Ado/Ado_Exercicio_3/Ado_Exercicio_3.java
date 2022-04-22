/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template/../

 */
package Lista_Ado;

/**
 * Crie um la&ccedil;o que imprima uma contagem regressiva de 100 a 0, mas que
 * decremente de 5 em 5. Use o la&ccedil;o for
 *
 * @author gda_a
 */
public class Ado_Exercicio_3 {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {
            if (i % 5 == 0) {
                System.out.println("Números decrement " + i);
            }
        }

    }

}
