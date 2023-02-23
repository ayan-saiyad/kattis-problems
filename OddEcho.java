package src;

import java.util.*;
public class OddEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            switch (i % 2) {
                case 0 -> list.add(s);
            }
        }
        for (String out : list) {
            System.out.println(out);
        }
        in.close();
    }
}
