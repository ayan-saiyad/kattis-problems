import java.util.*;
import java.io.*;

public class ElectricalOutlets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int p = Integer.parseInt(br.readLine());  p > 0; p--) {
            int count = 0;
            List<String> line = new ArrayList<>(List.of(br.readLine().split(" ")));

            for (int i = 1; i<line.size(); i++) {
                if (!(i == line.size())) {
                    count += Integer.parseInt(line.get(i)) -1 ;
                }
                else {
                    count += Integer.parseInt(line.get(i));
                }

            }
            System.out.println(count + 1);



        }
    }
}
