package Exercise21;
import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int i = scn.nextInt();
        A >>= i;
        A <<= i;
        System.out.println(A);
    }
}
