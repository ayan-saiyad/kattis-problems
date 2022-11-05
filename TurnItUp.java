import java.util.Scanner;
public class TurnItUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() + 1;

        int volume = 7;
        for (int i = 0; i < n; i++) {
            String command = in.nextLine();
            if (command.equals("Skru op!") && volume < 10) volume++;
            else if (command.equals("Skru ned!") && volume > 0) volume--;
        }
        System.out.println(volume);
        in.close();
    }
}
