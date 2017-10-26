package Exercise2String;

import java.util.Scanner;

public class n3 {
    public static char n3(char c) {
        if (Character.toUpperCase(c) == c)
            return Character.toLowerCase(c);
        else return Character.toUpperCase(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(n3(sc.nextLine().toCharArray()[0]));
    }
}
