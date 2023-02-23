package src;

import java.util.*;
import java.io.*;

public class Arrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine())/n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + m%n; j++) {
                pw.print("*");
            }
            pw.print("\n");
        }


        br.close();
        pw.close();
    }
}
