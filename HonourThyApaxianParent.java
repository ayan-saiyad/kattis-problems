import java.util.*;
import java.io.*;

public class HonourThyApaxianParent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String y = st.nextToken();
        String p = st.nextToken();

        if(y.charAt(y.length()-1) == 'e') {
            pw.println(y + "x" + p);
        } else if(y.endsWith("a")) {
            pw.println(y.substring(0, y.length()-1) + "ex" + p);
        } else if(y.endsWith("i")) {
            pw.println(y.substring(0, y.length()-1) + "ex" + p);
        } else if(y.endsWith("o")) {
            pw.println(y.substring(0, y.length()-1) + "ex" + p);
        } else if(y.endsWith("u")) {
            pw.println(y.substring(0, y.length()-1) + "ex" + p);
        } else if(y.endsWith("ex")) {
            pw.println(y + p);
        } else {
            pw.println(y + "ex" + p);
        }

        br.close();
        pw.close();
    }
}
