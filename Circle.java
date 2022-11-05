import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            double r = sc.nextDouble();
            if (r == 0) break;
            int m =sc.nextInt();
            int c = sc.nextInt();

            double a = Math.PI * Math.pow(r, 2);
            double a2 = 4 * Math.pow(r, 2) * c / m;

            System.out.println(a + " " + a2);
        }
    sc.close();
    }
}
