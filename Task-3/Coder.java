/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class Coder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((n * n + 1) / 2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i >= 0 && j >= 0) {
                    if ((i % 2 == 0 && j % 2 == 0) || i % 2 != 0 && j % 2 != 0) {
                        System.out.print('C');

                    } else if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
                        System.out.print('.');
                    }

                }
            }
            System.out.println("");
        }

    }

}
