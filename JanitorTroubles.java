import java.util.*;
import java.io.*;

public class JanitorTroubles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        double semiperimeter = (a + b + c + d) / 2;

        System.out.println(Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) * (semiperimeter - d)));
    }
}
