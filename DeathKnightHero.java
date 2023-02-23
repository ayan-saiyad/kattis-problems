import java.util.*;
import java.io.*;
public class DeathKnightHero {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = n;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.contains("CD")) {
                count--;
            }
        }
        pw.println(count);

        br.close();
        pw.close();
    }
}
