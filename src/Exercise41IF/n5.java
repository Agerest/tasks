package Exercise41IF;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int q = 0;
        if (a==b) {
            q=2;
            if (b==c) q++;
        }
        if (a==c) {
            q=2;
            if (b==c) q++;
        }
        if (c==b) {
            q=2;
            if (a==c) q++;
        }
        System.out.println(q);
    }
}
