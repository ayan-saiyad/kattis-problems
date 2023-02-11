import java.util.*;
import java.io.*;

public class ARealChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        pw.println(Math.sqrt(Long.parseLong(br.readLine())) * 4);

        br.close();
        pw.close();
    }
}
