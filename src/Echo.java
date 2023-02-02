package src;

import java.util.Scanner;
public class Echo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String x = in.nextLine();

        for (int i = 0; i < 3; i++) { 
            System.out.print(x + " ");
        }
        in.close();
    }
}
