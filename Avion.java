import java.util.*;
import java.io.*;

public class Avion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String count = "";
        for (int i = 1; i <= 5; i++) {
            String line = br.readLine().toUpperCase();
            if (line.contains("FBI")) count += i + " ";
        }
        if (count.equals("")) System.out.println("HE GOT AWAY!");
        else System.out.println(count);


    }
}