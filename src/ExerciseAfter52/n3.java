package ExerciseAfter52;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(xor(scanner.nextByte(), scanner.nextByte()));
    }

    private static int xor (byte x, byte y){
        return x ^ y;
    }
}
