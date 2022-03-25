/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_love_.username;

import java.util.Scanner;

public class I_love_Username {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int amazing = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[1] < arr[0] || arr[1] > arr[0]) {
                    amazing++;

                }
                if (arr[i] > arr[j]) {

                    amazing++;

                }

            }

        }
        System.out.println(amazing);

    }

}
