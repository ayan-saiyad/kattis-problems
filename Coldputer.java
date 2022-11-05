import java.util.Scanner;
public class Coldputer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        int n = in.nextInt();
        System.out.print("");
        String x = in.nextLine();

                }
            }

        System.out.println(total);

        int n = in.nextInt();
        for (int i = 0; i < 1; i++) {
            String x = in.nextLine();
            String[] split = x.split("\\s+");
            int total = 0;
            for (int s = 0; s < x.length(); s++) {
                if (split[s].equals("\\s")) {
                    total += 1;
                }
                System.out.println(total);

            }}
 */


        int n = in.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int a = in.nextInt();

            if (a < 0) {
                count++;

            }

        }
        System.out.println(count);
        in.close();
    }
}