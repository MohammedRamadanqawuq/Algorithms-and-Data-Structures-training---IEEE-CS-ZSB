/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stones.on.the.table;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class StonesOnTheTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String st = input.next();
        int counter = 0;
        for (int i = 0; i < size - 1; i++) {
            if (st.charAt(i) == st.charAt(i + 1)) {
                counter++;
            }

        }

        System.out.println(counter);

    }

}
