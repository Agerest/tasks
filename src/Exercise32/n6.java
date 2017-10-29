package Exercise32;

import java.util.Scanner;

public class n6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int resultK = 1;
        for (int i = 1; i <= k; i++) {
            resultK *= i;
        }
        int resultN = 1;
        for (int i = 1; i <= n; i++) {
            resultN *= i;
        }
        int resultNK = 1;
        for (int i = 1; i <= n-k; i++) {
            resultNK *= i;
        }
        int result = resultN/(resultK*resultNK);
        System.out.println(result);
    }
}
