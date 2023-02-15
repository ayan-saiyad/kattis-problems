import java.util.*;
import java.io.*;

public class CPRNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int[] cpr = (line.substring(0, 6) + line.substring(7)).chars().map(Character::getNumericValue).toArray();

        int end = cpr[0]*4 + cpr[1]*3 + cpr[2]*2 + cpr[3]*7 + cpr[4]*6 + cpr[5]*5 + cpr[6]*4 + cpr[7]*3 + cpr[8]*2 + cpr[9];

        pw.println( end % 11 == 0 ? 1 : 0 );


        br.close();
        pw.close();
    }
}
