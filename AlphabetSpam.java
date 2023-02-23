package src;

import java.util.*;
import java.io.*;

public class AlphabetSpam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        double upper = 0, lower = 0, symbol = 0, white = 0;
        for(int i = 0; i < line.length(); i++) {
                if ((int)line.charAt(i)>=65 && (int)line.charAt(i) <= 90) upper++;
                else if ((int)line.charAt(i)>=97 && (int)line.charAt(i) <= 122) lower++;
                else if ((int)line.charAt(i) == 95) white++;
                else symbol++;

        }
        pw.print(white/line.length() + "\n" + lower/line.length() + "\n" + upper/line.length() + "\n" + symbol/line.length());

        br.close();
        pw.close();
    }
}
