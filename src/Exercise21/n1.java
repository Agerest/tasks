package Exercise21;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = 2;
        int n = sc.nextInt()-1;
        if (n>-1) q <<= n;
        else q>>=1;
        System.out.println(q);
    }
}
