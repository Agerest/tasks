package ExerciseAfter52;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reverse(scanner.nextInt());
    }

    private static void reverse(int n){
        if(n > 9){
            System.out.print(n - n/10*10);
            reverse(n/10);
            return;
        }
        else {
            System.out.print(n);
            return;
        }
    }
}
