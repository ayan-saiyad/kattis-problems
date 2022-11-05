import java.util.Scanner;
public class jackolantern {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println(a * b * c);
        in.close();
    }
}
