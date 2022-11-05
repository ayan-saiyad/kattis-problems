import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int total = 0;

        for(int i = 0; i < n + 1; i++) {
            int input = in.nextInt();
            total += input*(input+1)/input +2;
        }
        System.out.println(total);
    in.close();
    }
}