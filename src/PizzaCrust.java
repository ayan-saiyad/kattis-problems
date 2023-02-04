package src;

import java.util.*;
import java.io.*;

public class PizzaCrust {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        pw.println(((Math.PI * (r - c) * (r - c)) ) / (Math.PI * r * r) * 100);


        br.close();
        pw.close();
    }
}
