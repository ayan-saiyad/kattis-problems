package src;

import java.util.*;
import java.io.*;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%x == 0 && i%y != 0) System.out.println("Fizz");
            else if (i%y == 0 && i%x != 0) System.out.println("Buzz");
            else  if (i%y == 0 && i%x == 0) System.out.println("FizzBuzz");
            else System.out.println(i);
        }
    }
}
