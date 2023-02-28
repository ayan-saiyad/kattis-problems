import java.util.*;
import java.io.*;

public class Kornislav {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        Arrays.sort(line);
        pw.println(Integer.parseInt(line[0]) * Integer.parseInt(line[2]));

        br.close();
        pw.close();
    }
}
