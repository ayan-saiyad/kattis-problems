package src;

import java.util.Scanner;
public class FYI {
    public static void main(String []args) {

        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        if (num.substring(0, 3).equals("555")) System.out.println(1);

        else System.out.println(0);
        in.close();
    }

}
