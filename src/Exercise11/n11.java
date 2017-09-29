package Exercise11;
import java.util.Scanner;

public class n11 {
    public void n11() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n%1440;
        int h = n/60;
        int m = n%60;
        System.out.println(h+" "+m);
    }
}