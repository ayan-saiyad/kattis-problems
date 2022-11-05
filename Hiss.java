import java.util.*;
public class Hiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().contains("ss")) System.out.println("hiss");
        else System.out.println("no hiss");
        sc.close();
    }
}
