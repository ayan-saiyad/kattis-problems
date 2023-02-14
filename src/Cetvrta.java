import java.util.*;
import java.io.*;

public class Cetvrta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }
        int x1 = x.get(0), y1 = y.get(0), x2 = x.get(1), y2 = y.get(1), x3 = x.get(2), y3 = y.get(2);

        if (x1 != x2 && x2 == x3) pw.print(x1 + " ");
        else if (x2 != x3 && x3 == x1) pw.print(x2 + " ");
        else if (x3 != x1 && x1 == x2) pw.print(x3 + " ");

        if (y1 != y2 && y2 == y3) pw.print(y1);
        else if (y2 != y3 && y3 == y1) pw.print(y2);
        else if (y3 != y1 && y1 == y2) pw.print(y3);
        br.close();
        pw.close();
    }
}
