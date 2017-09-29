package Exercise11;
import java.util.Scanner;

public class n12 {
    public void n12() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        h = h % 12;
        int m = sc.nextInt();
        m = m % 60;
        int s = sc.nextInt();
        s = s % 60;
        int res = (h*3600+m*60+s)/360;
        System.out.println(res);
    }
}
