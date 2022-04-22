/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Ado;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Ado_Exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numUsuario, multiplicador = 0, total = 0;

        System.out.println("Digite o número X :");
        numUsuario = sc.nextInt();

        for (int num = 0; num < 10; num++) {

            if (numUsuario >= 2 && numUsuario <= 1000) {
                total = numUsuario * ++multiplicador;
                System.out.println(multiplicador + " X " + numUsuario + " = " + total);

            } else {
                System.out.println("Digite novamente!");
                break;
            }
        }
    }

}