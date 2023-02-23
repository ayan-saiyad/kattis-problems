import java.util.*;
import java.io.*;

public class BasketballOneOnOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String x = br.readLine();
        int index = 0;
        boolean check = false;
        int counta= 0, countb = 0;
        for (int i = 0; i < x.length()-1; i+=2) {
            String line = x.substring(i, i+2);
            if (line.startsWith("A"))  {
                counta += Integer.parseInt(line.split("")[1]);
            }
            else {
                countb += Integer.parseInt(line.split("")[1]);
            }
            if (counta == 11 && countb == 11) {
                check = true;
                index = i+2;
                break;
            }
        }

        if (check) {
            while (counta < countb + 2 && countb < counta + 2) {
                if (index == x.length()-2) break;
                String line = x.substring(index, index+2);
                if (line.startsWith("A"))  {
                    counta += Integer.parseInt(line.split("")[1]);
                }
                else {
                    countb += Integer.parseInt(line.split("")[1]);
                }
                index += 2;
            }
        }

        pw.println((counta > countb)? "A" : "B");

        br.close();
        pw.close();
    }
}
