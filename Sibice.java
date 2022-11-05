import java.util.*;
public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        double x = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() <= x) System.out.println("DA");
            else System.out.println("NE");

        }
        sc.close();
    }
}
