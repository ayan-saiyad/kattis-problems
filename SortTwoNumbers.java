import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (b > a) System.out.println(a + " " + b);
        else System.out.println( b + " " + a);
        sc.close();
    }
}