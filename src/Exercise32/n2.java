package Exercise32;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        int summ = 0;
        for (byte i = 1; i < number; i++) {
            summ += i * (i + 1);
        }
        System.out.println(summ);
    }
}
