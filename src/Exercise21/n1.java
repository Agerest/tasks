package Exercise21;

import java.util.Scanner;

public class n1 {
    public static void n1() {
        Scanner scn = new Scanner(System.in);
        int q = 2;
        byte n = scn.nextByte();
        if (n<33) {
            q <<= n-1;
            System.out.println(q);
        }
    }
}
