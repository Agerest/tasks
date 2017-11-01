package Exercise52;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nn = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = sc.nextInt();
            if (nn[i]%2==0) {
                System.out.println(nn[i]);
            }
        }
    }
}
