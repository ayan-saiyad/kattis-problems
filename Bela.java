import java.util.*;
import java.io.*;

public class Bela {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int hands = Integer.parseInt(line.split(" ")[0]);
        String dominant = line.split(" ")[1];

        int[] dom = {11 , 4 , 3 , 20 , 10 , 14};
        int[] non = {11 , 4 , 3 , 2  , 10 ,  0};

        int sum = 0;

        for (int i = 0; i < hands*4; i++)
        {
            String card = br.readLine();
            String val = card.substring(0 , 1);
            String suit = card.substring(1);

            if (val.equals("A"))
                sum += non[0];

            else if (val.equals("K"))
                sum += non[1];

            else if (val.equals("Q"))
                sum += non[2];

            if (val.equals("J") && suit.equals(dominant))
                sum += dom[3];
            else if (val.equals("J"))
                sum += non[3];

            else if (val.equals("T"))
                sum += non[4];

            else if (val.equals("9") && suit.equals(dominant))
                sum += dom[5];
        }

       pw.println(sum);

        br.close();
        pw.close();
    }
}
