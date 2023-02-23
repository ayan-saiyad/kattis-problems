package src;

import java.util.Scanner;
public class Triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(), b = sc.nextDouble();

        System.out.println((h*b)/2);
        sc.close();
    }
}
