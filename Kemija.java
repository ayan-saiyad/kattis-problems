import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Kemija {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        ArrayList<Character> line = br.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));
        for (int i = 1; i < line.size()-1; i++) {
            if (line.get(i) == 'p') {
                switch ((int)(line.get(i-1))) {
                   case 97: line.remove(i); line.remove(i-1); break;
                   case 117: line.remove(i);line.remove(i-1); break;
                   case 101: line.remove(i);line.remove(i-1); break;
                   case 111: line.remove(i); line.remove(i-1); break;
                   case 105: line.remove(i); line.remove(i-1); break;
               }
            }
        }
        for (char c : line) {
            pw.print(c);
        }

        br.close();
        pw.close();
    }
}
