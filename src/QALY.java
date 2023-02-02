package src;

import java.util.*;
public class QALY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            total += a * b;
        }
        System.out.printf("%.3f", total);
        sc.close();
    }
}
