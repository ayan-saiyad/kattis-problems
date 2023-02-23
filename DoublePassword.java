import java.util.*;
import java.io.*;

public class DoublePassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] array1 = br.readLine().split("");
        String[] array2 = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (!array1[i].equals(array2[i]))
                count++;
        }
        System.out.println((int)Math.pow(2, count));

    }
}
