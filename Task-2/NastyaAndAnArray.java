/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nastya.and.an.array;

/**
 *
 * @author Mohammed Ramadan
 */
import java.util.*;

public class NastyaAndAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        int counter = 0;
        int counZero = 0;
        int countEquals = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();

        }

        Arrays.sort(arr);
// Mixed or zeros array
        for (int i = 0; i < size; i++) {

            if (arr[i] == 0) {
                counZero++;
            }

            counter = size - counZero;
           // break;
        }
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] == arr[j] && arr[i] != 0 && arr[j] != 0) {
//                    counter = 1;
//                }
//
//            }
//            //  break;
//
//        }
        if (counter == 1 || counter == size - counZero) {
            System.out.println(counter);
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        countEquals++;
                    }
                    counter = size - countEquals;
                }

                //  break;
            }
            if (counter == -size) {
                counter = 1;
            }

            System.out.println(counter);
        }

    }

}
