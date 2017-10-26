package Exercise2String;

public class n4 {
    public static void n4(String S1, String S2) {
        if (Compare(S1,S2)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean Compare(String S1, String S2) {
        String[] s1 = S1.split("");
        String[] s2 = S2.split("");
        if (s1.length==s2.length) {
            for (int i = 0; i < s1.length; i++)
                if (s1[i] != s2[i])
                    return false;
            return true;
        }
        else return false;
    }
}
