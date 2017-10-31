package Exercise41IF;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>0) System.out.println("1");
        else if (x<0) System.out.println("-1");
        else System.out.println("0");
    }
}
