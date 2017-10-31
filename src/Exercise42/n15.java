package Exercise42;

import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i)%1.0 == 0) System.out.println(i);
        }
    }
}
