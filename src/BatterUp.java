import java.util.*;
import java.io.*;

public class BatterUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        double bats = Double.parseDouble(br.readLine());
        double count = 0;
        List<String> in = new ArrayList<>(List.of(br.readLine().split(" ")));

        for (int i = 0; i < in.size(); i++) {
            if (!(in.get(i).contains("-")))
                count += Double.parseDouble(in.get(i));
            else bats--;
        }
        System.out.println(count/bats);

    }
}
