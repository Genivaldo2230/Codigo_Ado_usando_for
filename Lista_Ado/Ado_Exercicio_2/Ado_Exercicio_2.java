/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Ado;

import java.util.Scanner;

/**
 * EXERCÍCIO # 02
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até
 * X, um valor por linha, inclusive o X, se for o caso. Use o laço for.
 *
 * @author gda_a
 */
public class Ado_Exercicio_2 {

    public static void main(String[] args) {

        System.out.println("Digitar um valor inteiro X: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i = i + 2) {

            System.out.println(i);

        }

    }
}
