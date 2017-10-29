package Exercise32;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double result = 0.0;
        for (long i = 0; i <= n; i++) {
            result += Math.pow(-1.0,i)/(2.0*i+1);
        }
        result*=4;
        System.out.println(result);
    }
}
