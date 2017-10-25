package Exercise21;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        byte i = scn.nextByte();
        A = A | 1 << i;
        System.out.println(A);
    }
}
