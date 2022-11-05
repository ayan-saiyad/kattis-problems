import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String x = in.nextLine();

        System.out.print("h");
        for (int i = 0; i < (x.length() - 2) * 2; i++) {

            System.out.print("e");

        }
        System.out.println("y");
        in.close();
    }
}
// print twice as many 'e's  in "hey"
// i: heey o: heeeey

