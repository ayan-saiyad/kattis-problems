package src;

import java.util.*;
public class Sauron {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        int n = (line.length()/2)-1;
        if (line.length()%2 != 0)
            System.out.println("fix");
        else if (line.split("")[n].equals("(")) System.out.println("correct");
        else System.out.println("fix");
        in.close();
    }
}
