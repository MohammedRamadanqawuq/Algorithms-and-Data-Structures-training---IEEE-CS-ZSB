/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sereja.and.dima;

import java.util.*;

public class SerejaAndDima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCards = input.nextInt();
        int[] arr = new int[numCards];
        for (int i = 0; i < numCards; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int sereja = 0, dima = 0;
        int n = arr.length - 1;
        for (int i = 0; i < numCards; i += 2) {
            sereja = sereja + arr[n - i];

        }
        for (int i = 1; i < numCards; i += 2) {
            dima = dima + arr[n - i];

        }
        System.out.println(sereja + " " + dima);
//        for (int i = 0; i < numCards; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

}
