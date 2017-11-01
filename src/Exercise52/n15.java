package Exercise52;

import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max  = arr[0];
        for (i = 1; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
