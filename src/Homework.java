package src;

import java.io.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = br.readLine().split(";");
        int total = 0;
        for (int i = 0; i < elements.length; i++) {
            if (new String(elements[i]).contains("-")) {
                String[] subElements = elements[i].split("-");
                total += Integer.parseInt(subElements[1]) - Integer.parseInt(subElements[0]) + 1;
            } else {
                total++;
            }
        }
        System.out.println(total);
        
    }
}

