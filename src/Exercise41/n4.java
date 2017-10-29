package Exercise41;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int m = Integer.parseInt(temp.split(" ")[0]);
        int n = Integer.parseInt(temp.split(" ")[1]);
        int count = 0;
        for (int i = m; i<=n; i++) {
            for (int j = 1; j<i; j++) {
                if (i%j == 0) {
                    count += j;
                }
            }
            if (count==i) System.out.println(i);
            else System.out.println("Absent");
            count = 0;
        }
    }
}
