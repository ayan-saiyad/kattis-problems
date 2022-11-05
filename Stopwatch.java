import java.util.*;
public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), y, x, sum = 0;
        if (n%2 != 0) System.out.println("still running");
        else {
            for (int i = 0; i < n/2; i++) {
                y = sc.nextInt();
                x = sc.nextInt();
                sum += x - y;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
