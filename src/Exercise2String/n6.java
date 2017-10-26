
import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getline(sc.nextLine());
    }

    public static void getline(String S) {
        String maxWord = "";
        String[] s = S.split(" ");
        for (int i = 0; i<s.length; i++)
            if (maxWord.length()<s[i].length()) maxWord = s[i];
        System.out.println(maxWord);
        System.out.println(maxWord.length());
    }
}
