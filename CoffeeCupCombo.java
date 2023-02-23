import java.util.*;
import java.io.*;

public class CoffeeCupCombo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        br.readLine();
        char[] line = br.readLine().toCharArray();
        int c = 0, count = 0;

        for (char x : line) {
            if (x == '1')  {
                count++;
                c = 2;
            }
            else if (x == '0' && c > 0) {
                count++;
                c--;
            }
        }
        pw.println(count);

        br.close();
        pw.close();
    }
}
