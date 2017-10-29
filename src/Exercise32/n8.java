package Exercise32;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double result = 0.0;
        for (long i = 1; i <= n; i++) {
            result += 1.0/(i*i);
        }
        System.out.println(result);
    }
}
