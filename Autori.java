import java.util.*;
public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }
        sc.close();
    }
}
