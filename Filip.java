import java.util.*;
import java.io.*;

public class Filip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String x = sc.next(), y = sc.next();

        int num1 = Integer.parseInt(x.charAt(2) + ""+ x.charAt(1) + x.charAt(0));

        int num2 = Integer.parseInt(y.charAt(2) + ""+ y.charAt(1) + y.charAt(0));

        System.out.println(Math.max(num1, num2));
    }
}
