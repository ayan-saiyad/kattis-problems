import java.util.*;
import java.io.*;

public class Cudoviste {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String in = br.readLine();
        int r = Integer.parseInt(in.split(" ")[0]);
        int c = Integer.parseInt(in.split(" ")[1]);

        String[][] grid = new String[r][c];

        for (int i = 0; i < r; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < c; j++) {
                grid[i][j] = line[j];
            }
        }


        int c0, c1, c2, c3, c4; c0 = c1 = c2 = c3 = c4 = 0;

        for(int i = 0; i < r-1;i++) {
            for (int j = 0; j < c-1; j++) {
                String sq = grid[i][j] + grid[i][j+1] + grid[i+1][j] + grid[i+1][j+1];
                int cars = 0;
                if (sq.contains("#")) continue;
                else {
                    for (String s : sq.split("")) if (s.equals("X")) cars++;
                }

                if (cars == 0) c0++;
                else if (cars == 1) c1++;
                else if (cars == 2) c2++;
                else if (cars == 3) c3++;
                else if (cars == 4) c4++;
            }
        }

        pw.println(c0);
        pw.println(c1);
        pw.println(c2);
        pw.println(c3);
        pw.println(c4);




        pw.close();
        br.close();
    }
}
