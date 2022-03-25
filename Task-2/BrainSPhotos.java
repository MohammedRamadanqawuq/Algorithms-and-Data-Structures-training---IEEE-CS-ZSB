/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.s.photos;

import java.util.Scanner;

public class BrainSPhotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        boolean flag = false;
        char arr[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = input.next().charAt(0);

            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                flag = (arr[i][j] == 'W' || arr[i][j] == 'B' || arr[i][j] == 'G' && (arr[i][j] != 'C' || arr[i][j] != 'M' || arr[i][j] != 'Y'));

            }

        }
        if (flag == true) {
            System.out.println("#Black&White");
        } else if (flag == false) {
            System.out.println("#Color");
        }

    }

}
