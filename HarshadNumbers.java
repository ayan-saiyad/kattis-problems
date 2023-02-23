import java.util.*;
import java.io.*;

public class HarshadNumbers {

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if (num % digitSum(num) == 0) pw.println(num);
        else {
            for (int i = num; i < 1000000000; i++) {
                if (i % digitSum(i) == 0) {
                    pw.println(i);
                    break;
                }
            }
        }
        br.close();
        pw.close();


    }

}
