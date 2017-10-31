package Exercise21;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        byte i = scanner.nextByte();
        int mask  = 1 << i;
        System.out.println(a ^ 1 << i);
    }
}
