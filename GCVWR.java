import java.io.*;
import java.util.Scanner;

public class GCVWR {
    public static void main(String []args)throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int G = sc.nextInt(), T = sc.nextInt(), n = sc.nextInt();
        int items = 0;
        for (int i = 0; i < n; i++) {
            items += sc.nextInt();
        }
        System.out.println((int)((G-T)*.9 - items));
    }
}
