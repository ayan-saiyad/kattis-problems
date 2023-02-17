import java.util.*;
import java.io.*;

public class Grading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int grade = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (grade >= a) pw.println("A");
        else if (grade >= b) pw.println("B");
        else if (grade >= c) pw.println("C");
        else if (grade >= d) pw.println("D");
        else if (grade == e) pw.println("E");
        else if (grade < e) pw.println("F");

        br.close();
        pw.close();
    }
}
