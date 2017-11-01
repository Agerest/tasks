package ExerciseAfter52;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(min(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    static int min (int a, int b, int c, int d){
        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        int min = a;
        for (int i = 1; i < 4; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
