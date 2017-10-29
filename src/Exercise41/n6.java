package Exercise41;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println(a);
    }
}
