package Exercise11;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a = i / 100;
        int b = i / 10;
        b = b%10;
        int c = i % 10;
        System.out.println(a+b+c);
    }
}
