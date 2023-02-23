import java.util.*;
import java.io.*;

public class GrassSeed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += sc.nextDouble() * sc.nextDouble() * cost;
        }
        System.out.println(total);
    }
}
