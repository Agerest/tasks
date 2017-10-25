package Exercise11;
import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n%1440;
        int h = n/60;
        int m = n%60;
        System.out.println(h+" "+m);
    }
}