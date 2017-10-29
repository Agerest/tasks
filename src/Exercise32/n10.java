package Exercise32;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        long n = sc.nextLong();
        double result = 1;
        for (long i = 1; i <= n; i++) {
            result += Math.pow(a,i);
        }
        System.out.println(result);
    }
}
