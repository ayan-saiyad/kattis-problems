import java.util.*;
import java.io.*;
public class Apoxians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        String answer = "";
        answer += line.charAt(0);

        StringBuilder answerBuilder = new StringBuilder(answer);
        for (int i = 1; i <line.length(); i++) {
            if (line.charAt(i) != line.charAt(i - 1)) {
                answerBuilder.append(line.charAt(i));
            }
       }
        answer = answerBuilder.toString();
        System.out.println(answer);


    }
}