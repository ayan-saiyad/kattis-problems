package src;

import java.util.Scanner;

public class Faktor {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = in.nextInt();
        System.out.print((int)(a * Math.ceil(i-1) + 1));
        in.close();
    }
}
