import java.util.*;
import java.io.*;

public class CryptographerConundrum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String s = br.readLine();
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i%3 == 0 && s.charAt(i) != 'P')
                total++;
            else if (i%3 == 1 && s.charAt(i) != 'E')
                total++;
            else if (i%3 == 2 && s.charAt(i) != 'R')
                total++;
        }
        System.out.println(total);
    }
}
