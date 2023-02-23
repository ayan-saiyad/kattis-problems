package src;

import java.io.*;

public class FiftyShadesOfPink {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine().toLowerCase();
            if (line.contains("rose") || line.contains("pink")) counter++;
        }
        pw.println((counter == 0)? "I must watch Star Wars with my daughter" : counter);

        br.close();
        pw.close();
    }
}
