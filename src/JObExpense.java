package src;

import java.util.*;
public class JObExpense {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int x = 0;
            for(int i=0;i<n;i++){
                int y = in.nextInt();
                if (y < 0)
                    x += y;
            }
            System.out.println(Math.abs(x));
            in.close();
    }
}
