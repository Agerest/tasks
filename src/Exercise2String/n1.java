package Exercise2String;
import java.io.*;

public class n1 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char c = bufferedReader.readLine().toCharArray()[0];
        if (isDigit(c)) System.out.println("yes");
        else System.out.println("no");
    }
    public static boolean isDigit(char c){
        if (c >= '0' && c<='9') return true;
        else return false;
    }
}
