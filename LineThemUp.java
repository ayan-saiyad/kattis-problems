import java.util.*;
import java.io.*;

public class LineThemUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] name = new String[n];
        boolean inc = false;
        boolean neither = false;
        boolean dec = false;

        for (int i = 0; i < n; i++) {
            name[i] = br.readLine();
        }
        for (int j = 0; j < n-1; j++) {
            if (name[j].compareTo(name[j + 1]) < 0) {
                inc = true;
            }
            else {
                dec = true;
            }
        }
        if (dec && inc) {
            pw.println("NEITHER");
        }
        else if (inc) {
            pw.println("INCREASING");
        }
        else {
            pw.println("DECREASING");
        }


        br.close();
        pw.close();
    }
}
