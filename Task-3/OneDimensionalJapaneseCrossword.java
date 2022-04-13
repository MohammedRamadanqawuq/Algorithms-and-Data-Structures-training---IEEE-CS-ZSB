/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.dimensional.japanese.crossword;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class OneDimensionalJapaneseCrossword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            String str = input.next();
            int blackCount = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'B') {
                    blackCount++;
                }

                if (blackCount != 0 && str.charAt(i) == 'W') {
                    list.add(blackCount);
                    blackCount = 0;
                }

                if (i == str.length() - 1 && blackCount != 0) {
                    list.add(blackCount);
                }
            }

            System.out.println(list.size());
            list.forEach(i -> {
                System.out.print(i + " ");
            });
        }

    }

}
