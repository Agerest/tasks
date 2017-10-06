package Exercise21;
import java.util.Scanner;

public class n3 {
    public static void n3() {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        byte i = scn.nextByte();
        A >>= i;
        System.out.println(A);
    }
}
