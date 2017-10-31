package Exercise42;

import java.util.Scanner;

public class n17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int temp = 1;
        while (temp <= n){
            System.out.println(temp);
            temp <<= 1;
        }
    }
}
