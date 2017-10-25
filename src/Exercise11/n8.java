package Exercise11;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        i %= 100;
        i /= 10;
        System.out.println(i);
    }
}