import java.util.*;
import java.io.*;

public class HeartRate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String line = br.readLine();

            int b = Integer.parseInt(line.split(" ")[0]);
            double p = Double.parseDouble(line.split(" ")[1]);

            pw.printf("%.4f ", ((60*b)/p) - 60/p);
            pw.printf("%.4f ", (60*b)/p);
            pw.printf("%.4f \n", ((60*b)/p) + 60/p);

        }

        br.close();
        pw.close();
    }
}
