import java.util.*;
import java.io.*;

public class Datum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        switch (m) {
            case 1: break;
            case 2: d += 31; break;
            case 3: d += 59; break;
            case 4: d += 90; break;
            case 5: d += 120; break;
            case 6: d += 151; break;
            case 7: d += 181; break;
            case 8: d += 212; break;
            case 9: d += 243; break;
            case 10: d += 273; break;
            case 11: d += 304; break;
            case 12: d += 334; break;
        }

        System.out.println((d % 7 == 4) ? "Sunday" : (d % 7 == 5) ? "Monday" : (d % 7 == 6) ? "Tuesday" : (d % 7 == 0) ? "Wednesday" : (d % 7 == 1) ? "Thursday" : (d % 7 == 2) ? "Friday" : "Saturday");


        br.close();
        pw.close();
    }
}
