package Exercise21;
import java.util.Scanner;

public class n2 {
    public static void n2() {
        Scanner scn = new Scanner(System.in);
        int q = 2, qq = 2;
        byte n = scn.nextByte();
        byte m = scn.nextByte();
        if (n<32&&m<32&&n!=m) {
            q <<= n-1;
            qq <<= m-1;
            System.out.println(q+qq);
        }
    }
}
