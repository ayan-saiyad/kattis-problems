import java.util.*;
import java.io.*;

public class Cetiri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String[] arr = (br.readLine().split(" "));
        Arrays.sort(arr);
        if (Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]) == Integer.parseInt(arr[2]) - Integer.parseInt(arr[1]))
            System.out.println(Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]));

        //unfinished
        br.close();
        pw.close();
    }
}
