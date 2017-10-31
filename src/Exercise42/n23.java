package Exercise42;

import java.util.Scanner;

public class n23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 1;
        int temp1 = 1;
        for (int i = 2; i <= n; i++) {

            summ += temp1;
            temp1 = summ - temp1;
        }
        System.out.println(summ);
    }
}
