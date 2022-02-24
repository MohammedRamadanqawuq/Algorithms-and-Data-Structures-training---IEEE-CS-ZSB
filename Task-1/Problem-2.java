
package approximate.number.of.primes;

import java.util.*;
import java.io.IOException;

public class ApproximateNumberOfPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double max, min;
        long N = in.nextLong();
        max = (N / Math.log(N));
        min = (N / Math.log(N)) * 1.25506;
        System.out.println(max + " " + min);

    }

}
