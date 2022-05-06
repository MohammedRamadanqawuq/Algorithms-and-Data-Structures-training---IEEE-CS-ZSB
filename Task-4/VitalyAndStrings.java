/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitaly.and.strings;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class VitalyAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        char ch[] = t.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == 'a') {
                ch[i] = 'z';

            } else {
                ch[i]--;
                break;
            }
        }
        String st = new String(ch);
        if (st.equals(s)) {
            System.out.println("No such string");
        } else {
            System.out.println(st);
        }

    }

}
