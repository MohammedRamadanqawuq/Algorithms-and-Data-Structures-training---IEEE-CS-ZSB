/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.to.udayland;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.Scanner;

public class BusToUdayland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] s = new String[N];
        boolean flag = false;
        char re = '+';
        for (int i = 0; i < s.length; i++) {
            s[i] = input.next();
        }
        OUTER:
        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case "OO|OX":
                    flag = true;
                    s[i] = "++|OX";
                    break OUTER;
                case "OO|XO":
                    flag = true;
                    s[i] = "++|XO";
                    break OUTER;
                case "OO|OO":
                    flag = true;
                    s[i] = "++|OO";
                    break OUTER;
                case "OO|XX":
                    flag = true;
                    s[i] = "++|XX";
                    break OUTER;
                case "XX|OO":
                    flag = true;
                    s[i] = "XX|++";
                    break OUTER;
                case "XO|OO":
                    flag = true;
                    s[i] = "XO|++";
                    break OUTER;
                case "OX|OO":
                    flag = true;
                    s[i] = "OX|++";
                    break OUTER;
                default:
                    break;
            }
        }
        if (flag == true) {
            System.out.println("YES");
            for (int i = 0; i < N; i++) {
                System.out.println(s[i]);
            }
        } else {
            System.out.println("NO");
        }
    }

}
