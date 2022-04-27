/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting.sticks;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class CountingSticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int A = 0, B = 0, C = 0, sign1 = 0, sign2 = 0;//sign1 ==>> + && sign2 ==>> =
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                A++;

            } else if (s.charAt(i) == '+') {
                sign1 = i;// position of + sign
                break;

            }

        }
        for (int i = sign1 + 1; i < s.length(); i++) {
            if (s.charAt(i) != '=') {
                B++;

            } else if (s.charAt(i) == '=') {
                sign2 = i;//position of = sign
                break;

            }

        }
        for (int i = sign2 + 1; i < s.length(); i++) {
            if (s.charAt(i) != '=' && s.charAt(i) != '+') {
                C++;

            } else {

                break;

            }

        }
        if ((A + B) - C == 2 && A != 1) {
            for (int i = 0; i < A - 1; i++) {
                System.out.print('|');
            }
            for (int i = A; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println('|');
        } else if ((A + B) - C == -2 && A != 1) //System.out.println("A = " + A + "\n" + "B = " + B + "\n" + "+ position = " + sign1 + "\n" + "= position = " + sign2 + "C = " + C);
        {
            System.out.print('|');
            for (int i = 0; i <= sign2; i++) {

                System.out.print(s.charAt(i));
            }
            for (int i = sign2 + 1; i < s.length() - 1; i++) {

                System.out.print(s.charAt(i));
            }
            System.out.println();

        } else if ((A + B) - C == 0) {
            System.out.println(s);
        } else if ((A + B - C == 2 && A == 1)) {
            for (int i = 0; i < sign1 + 1; i++) {
                System.out.print(s.charAt(i));
            }
            for (int i = sign1 + 2; i < sign2 + 1; i++) {
                System.out.print(s.charAt(i));
            }
            for (int i = sign2 + 1; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println('|');

        } else if (A == 1 && B == 1 && (A + B - C == -2)) {
            System.out.print('|');
            for (int i = 0; i < s.length() - 1; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();

        } else {
            System.out.println("Impossible");
        }
    }

}
