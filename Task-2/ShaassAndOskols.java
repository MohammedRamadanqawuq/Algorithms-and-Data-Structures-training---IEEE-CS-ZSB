/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaass.and.oskols;

import java.util.Scanner;

public class ShaassAndOskols {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int birds[] = new int[N];
        for (int i = 0; i < N; i++) {
            birds[i] = input.nextInt();
        }
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x != 0) 
                birds[x - 1] += y - 1;
            
            if (x != N - 1) 
                birds[x + 1] += birds[x] - y;
            
            birds[x] = 0;

        }
        for (int i = 0; i < N; i++) {
            System.out.println(birds[i]);

        }
    }

}
