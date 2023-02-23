import java.util.*;
import java.io.*;

public class CountVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String array = br.readLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.charAt(i) == 'a' || array.charAt(i) == 'e' || array.charAt(i) == 'i' || array.charAt(i) == 'o' || array.charAt(i) == 'u')
                count++;
        }
        System.out.println(count);
    }
}
