import java.util.*;
public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L =  sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        int sum = 0;
        for (int i = L; i <= D; i++) {
            int j = i;
            while (j != 0) {
                sum += j % 10;
                j /= 10;
            }
            if (sum == x) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

