import java.util.*;
import java.io.*;

public class LicenseToLaunch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        ArrayList<String> day = new ArrayList<>(List.of(line.split(" ")));
        int low = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num < low) {
                low = num;
            }
        }
        pw.println(day.indexOf(String.valueOf(low)));
        br.close();
        pw.close();
    }
}
