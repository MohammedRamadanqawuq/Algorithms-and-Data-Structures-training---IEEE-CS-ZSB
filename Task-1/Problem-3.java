import java.io.IOException;
 import java.util.*;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */Scanner input = new Scanner(System.in);
        int num = input.nextInt();//number of a you want to repeate
        String repeat = "";
        for (int i = 0; i < num; i++) {
            repeat = repeat + "a";
        }
        System.out.println("Feliz nat"+repeat+"l!");
 
    }
 
}
