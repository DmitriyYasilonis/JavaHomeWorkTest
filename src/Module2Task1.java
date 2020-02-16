
import java.lang.reflect.Array;
import java.util.Scanner;

public class Module2Task1 {
    // Task1
    public static void main(String[] Strings) {
        int i, a, count;
        for (a = 1; a <= 5000; a++) {
            count = 0;
            for (i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && a != 1) {
                System.out.print(a + " ");
            }
        }
    }
}











