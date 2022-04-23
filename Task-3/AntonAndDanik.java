/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anton.and.danik;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class AntonAndDanik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String str = input.next();
        int Anton = 0, Danik = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                Anton++;
            }
            if (str.charAt(i) == 'D') {
                Danik++;
            }

        }
        if (Anton > Danik) {
            System.out.println("Anton");
        } else if (Danik > Anton) {
            System.out.println("Danik");
        } else if (Anton == Danik) {
            System.out.println("Friendship");
        }
    }

}
