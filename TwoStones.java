import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoStones {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(in.readLine());
        if (n%2 != 0) System.out.println("Alice");
        else System.out.println("Bob");

    }
}
