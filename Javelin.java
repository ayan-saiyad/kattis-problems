import java.util.Scanner;

public class Javelin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += in.nextInt();
        }

        System.out.println(total - n + 1);
        in.close();
    }
}
// first number is how many numbers in the list, add the values in the list up