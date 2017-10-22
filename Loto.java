/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Loto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        System.out.println("loto");
        int loto[] = new int[6];
        int usuario[] = new int[6];
        int i, j;
        int cont_asierto = 0;

        for (i = 0; i < usuario.length; i++) {
                System.out.println("ingrese numero entre 0 y 36 - N : " + (i + 1));
                usuario[i] = intro.nextInt();
               
            
            for (j = 0; j < i; j++) {
                if (usuario[i] == usuario[j]) {
                    i--;
                    break;
                }
            }
        }
        

        for (i = 0; i < loto.length; i++) {
            loto[i] = (int) (Math.random() * 36);
            for (j =1 ; j < i; j++) {
                if (loto[i] == loto[j]) {
                    i--;
                    break;
                }
            }

        }
        System.out.println("numero carton ");
        for (i = 0; i < usuario.length; i++) {
            System.out.print(" | " + usuario[i] + " | ");
        }
        System.out.println("");
        System.out.println("numeros sorteo");
        for (i = 0; i < loto.length; i++) {
            System.out.print(" | " + loto[i] + " | ");
        }
        for (i = 0; i < 6; i++) {

            for (j = 0; j < 6; j++) {

                if (usuario[i] == loto[i]) {
                    cont_asierto++;
                }
            }
        }
        System.out.println("");
        System.out.println("numero de asiertos " + cont_asierto);

    }

}
