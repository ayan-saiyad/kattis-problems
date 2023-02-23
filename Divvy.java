package src;

import java.util.*;
public class Divvy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total  = 0;
        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
        }
        if (total % 3 == 0) System.out.println("yes");
        else System.out.println("no");
        sc.close();

    }
}
