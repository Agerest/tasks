package Exercise2String;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getline(sc.nextLine()));
    }
    public static int getline(String S) {
        return S.split(" ").length;
    }
}
