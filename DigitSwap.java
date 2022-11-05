import java.util.Scanner;
public class DigitSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char[] ch = x.toCharArray();


        System.out.println(ch[1] + "" + ch[0]);
        in.close();
    }
}
