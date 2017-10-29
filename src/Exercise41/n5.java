package Exercise41;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        int res = 1;
        while (n>0) {
            if (n%2==1) {
                res *= a;
            }
            a *= a;
            n /= 2;
        }
        System.out.println(res);
    }
}
