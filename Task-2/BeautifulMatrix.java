/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautiful.matrix;

/**
 *
 * @author Mohammed Ramadan
 */
import java.util.Scanner;

public class BeautifulMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int matrix[][] = new int[5][5];
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                matrix[r][c] = input.nextInt();

            }
        }

        for (int c = 0; c < 5; c++) {
            if (matrix[2][c] == 1) {
                int column = c;
                if (column > 2) {
                    counter = column - 2;
                    break;

                } else if (column < 2) {
                    counter = 2 - column;
                    break;
                }
            }
        }
        for (int r = 0; r < 5; r++) {
            if (matrix[r][2] == 1) {
                int row = r;
                if (row > 2) {
                    counter = row - 2;
                    break;
                } else if (row < 2) {
                    counter = 2 - row;
                    break;
                }
            }
        }

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matrix[r][c] == 1) {
                    if (r > 2 && c > 2) {
                        counter = (r - 2) + (c - 2);
                    } else if (r < 2 && c < 2) {
                        counter = (2 - r) + (2 - c);
                    } else if (r > 2 && c < 2) {
                        counter = (r - 2) + (2 - c);
                    } else if (r < 2 && c > 2) {
                        counter = (2 - r) + (c - 2);
//                    } else {
//                        counter = 0;
                    }

                }
            }
        }

        System.out.println(counter);
    }

}
