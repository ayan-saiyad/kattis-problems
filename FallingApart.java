import java.util.*;
import java.io.*;
import java.util.Collections;

public class FallingApart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] val = new Integer[n];
        int suma = 0, sumb = 0;
        for (int i = 0; i < n; i++) {
            val[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(val, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) suma += val[i];
            else sumb += val[i];
        }


        pw.println(suma + " " + sumb);




        br.close();
        pw.close();
    }
}
