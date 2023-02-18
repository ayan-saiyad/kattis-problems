import java.util.*;
import java.io.*;

public class HeirsDilemma {

    public static boolean isUniqueAndDivisible(int[] arr, int num) {
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            check.add(arr[i]);
        }
        boolean ch = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!(arr[j] == 0)) {
                    if (!(num % arr[j] == 0)) {
                        ch = false;
                    }
                }
                else ch = false;
            }
        }

        return (check.size() == arr.length && ch);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] digits;
        int count = 0;
        for (int i = l; i <= h; i++) {
            digits = Integer.toString(i).chars().map(c -> c-'0').toArray();
            if (isUniqueAndDivisible(digits, i)) {
                count++;
            }
        }
        pw.println(count);

        br.close();
        pw.close();
    }
}
