package Exercise11;
import java.util.Scanner;

public class n10 {
    public void n10() {
        Scanner sc = new Scanner(System.in);
        final int length = 109;
        int v = sc.nextInt();
        int t = sc.nextInt();
        int result = 0;
        if (v*t>0)
            result = (v*t)%109;
        else if (v*t<=0)
            result = (109 + ((v * t) % 109)) % 109;
        System.out.println(result);
    }
}
