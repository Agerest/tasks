package Exercise42;

import java.util.Scanner;

public class n13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summ = 0;
        while (number != 0){
            summ += number;
            number = scanner.nextInt();
        }
        System.out.println(summ);
    }
}
