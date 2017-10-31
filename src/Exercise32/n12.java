package Exercise32;

public class n12 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if(((i - (i/10) * 10) * (i/10) * 2 == i)){
                System.out.println(i);
            }
        }
    }
}
