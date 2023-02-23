
import java.io.*;

public class CanadianEh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        pw.println(br.readLine().endsWith("eh?") ? "Canadian!" : "Imposter!");

        br.close();
        pw.close();
    }
}
