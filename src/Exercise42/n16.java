package Exercise42;

import java.util.Scanner;

public class n16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        while (n>=2) {
            n/=2;
            if (n%1.0 > 0) break;
        }
        if (n==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
