package Exercise21;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int q = 2, qq = 2;
        int n = scn.nextInt()-1;
        int m = scn.nextInt()-1;
        if (n>-1) q <<= n;
        else q>>=1;
        if (m>-1) qq <<= m;
        else qq>>=1;
        System.out.println(q+qq);
    }
}
