import java.util.*;
import java.io.*;

public class DigitProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int[] digits = br.readLine().chars().map(c -> c-'0').toArray();

        int prod;
        while(true) {
            prod = 1;
            for (int i = 0; i < digits.length; i++) {
                if (!(digits[i] == 0)) prod *= digits[i];
            }
            if (prod < 9) break;

            digits = Integer.toString(prod).chars().map(c -> c-'0').toArray();
        }
        pw.println(prod);
        br.close();
        pw.close();
    }
}
