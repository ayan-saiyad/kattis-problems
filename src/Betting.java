package src;

import java.util.*;
public class Betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        System.out.printf("%.10f\n", 100/num);
        System.out.printf("%.10f", 100/(100-num));
        sc.close();
    }
}
