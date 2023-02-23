package src;

import java.util.*;
import java.io.*;

public class Tri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean found = true;
        
        if (c == a + b && found) {
            pw.println(a + "+" + b + "=" + c);
            found = false;
        } else if (c == a - b && found) {
            pw.println(a + "-" + b + "=" + c);
            found = false;
        } else if (c == a * b && found) {
            pw.println(a + "*" + b + "=" + c);
            found = false;
        } else if (c == a / b && found) {
            pw.println(a + "/" + b + "=" + c);
            found = false;
        } else if (a == b + c && found) {
            pw.println(a + "=" + b + "+" + c);
            found = false;
        } else if (a == b - c && found) {
            pw.println(a + "=" + b + "-" + c);
            found = false;
        } else if (a == b * c && found) {
            pw.println(a + "=" + b + "*" + c);
            found = false;
        } else if (a == b / c && found) {
            pw.println(a + "=" + b + "/" + c);
            found = false;
        }

        br.close();
        pw.close();
    }
}
