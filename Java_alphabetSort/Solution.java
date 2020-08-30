import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int i = 0;
        int c = 0;
        int sum = A.length() + B.length();
        char first = A.charAt(0);
        char second = B.charAt(0);
        String result = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char s: alphabet) {
          i++;
          if (first == s) {
            break;
          }
        }
        for (char s : alphabet) {
          c++;
          if (second == s) {
            break;
          }
        }

        if (i > c) {
          result = "Yes";
        }
        if (c >= i) {
          result = "No";
        }
        // if (A.equals("java") && B.equals("hello")) {
        //     result = "Yes"
        // }
        System.out.println(sum);
        System.out.println(result);
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        
    }
}

