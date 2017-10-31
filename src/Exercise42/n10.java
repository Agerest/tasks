package Exercise42;

import java.util.Scanner;

public class n10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int number = scanner.nextInt();
        while (number != 0){
            if(max < number){
                max = number;
            }
            number = scanner.nextInt();
        }
        System.out.println(max);
    }
}
