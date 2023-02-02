package src;

import java.util.*;


public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            sum += a + b + c + d;
            list.add(i, sum);
            sum = 0;
        }

        System.out.println(list.indexOf(Collections.max(list))+1 + " " + Collections.max(list));
        sc.close();
        }

    }

