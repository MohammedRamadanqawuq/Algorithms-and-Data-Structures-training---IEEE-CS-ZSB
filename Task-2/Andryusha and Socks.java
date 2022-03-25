import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[1001000];
        int t, a, mx = 0, cnt = 0;
        t = s.nextInt();
        for (int i = 0; i < 2 * t; i++) {
            a = s.nextInt();
            arr[a]++;
            if (arr[a] == 2) {
                cnt--;
            } else {
                cnt++;
            }
            mx = mx > cnt ? mx : cnt;
        }
        System.out.println(mx);
    }
}
