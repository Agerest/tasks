package Exercise51;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int n = b*d;
        int m = n/b*a+n/d*c;
        for (int i = (n<m?n:m) ; i >1 ; i--) {
            if (n%i==0&&m%i==0) {
                n/=i;
                m/=i;
            }
        }
        System.out.println(m+" "+n);
    }
}
