package Exercise52;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nn = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            nn[i] = sc.nextInt();
            if (nn[i]>0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
