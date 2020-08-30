import java.util.Scanner;
import java.util.*;

public class Temp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String temp = "";
        ArrayList<String> sets = new ArrayList<String>();
        // ArrayList<String> ab = new ArrayList<String>();
        char[] ab = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int ab_cnt = 0; 
        int l = s.length();


        for (int i = 0; i <= l-k; i++) {
            temp = s.substring(i, i+k);
            sets.add(temp);   
        }
        Collections.sort(sets);
        System.out.println(sets);

        smallest = sets.get(0);
        largest = sets.get(sets.size() - 1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // String s = scan.next();
        // int k = scan.nextInt();
        // scan.close();
        String s = "welcomeToJava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }
}
