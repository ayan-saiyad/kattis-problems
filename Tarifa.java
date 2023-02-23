package src;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), n = in.nextInt(), thing = x;


        for (int i = 0; i < n; i++) {
            thing -= in.nextInt();

            thing += x;
        }
        System.out.println(thing);
        in.close();
    }
}