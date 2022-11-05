import java.util.Scanner;
public class NSum {
    public static void main(String []args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i<n; i++) {
            int a = in.nextInt();
            sum += a;
        }
        System.out.println(sum);
        in.close();
    }
}