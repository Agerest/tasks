package Exercise41;

public class n2 {
    public static void main(String[] args) {
        for (int number = 100; number < 1000; number++){
            if(((number - (number/100) * 100) * 7) == number){
                System.out.println(number);
            }
        }
    }
}
