import java.util.*;
import java.io.*;

public class Bijele {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> corr = new ArrayList<>(List.of("1", "1", "2", "2", "2", "8"));
        List<String> in = new ArrayList<>(List.of(br.readLine().split(" ")));
        for (int i = 0; i < in.size(); i++) {
            if (!corr.get(i).equals(in.get(i))) {
                System.out.print(Integer.parseInt(corr.get(i)) - Integer.parseInt(in.get(i)) + " ");
            }
            else System.out.print(0 + " ");
        }
    }
}
