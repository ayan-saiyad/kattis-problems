import java.util.Scanner;

public class FindA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(s.substring(s.indexOf('a'), s.length()));
        in.close();

    }
}