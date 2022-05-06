/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beros.file.system;

/**
 *
 * @author Mohammed_Ramadan
 */
import java.util.*;

public class BerOSFileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.next();
        String replaceAll = path.replaceAll("/+", "/");
        if (replaceAll.equals("/")) {
            System.out.println(replaceAll);
        } else if (replaceAll.endsWith("/")) {
            for (int i = 0; i < replaceAll.length() - 1; i++) {
                System.out.print(replaceAll.charAt(i));
            }
            System.out.println();
        } else {
            System.out.println(replaceAll);
        }
    }

}
