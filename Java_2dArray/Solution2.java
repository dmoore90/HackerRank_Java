import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException {
        // File myObj = new File("/home/r34p3r/env_java/hackerrank/Java_2dArray/test.txt");
        // Scanner scanner = new Scanner(myObj);

        // String l = scanner.nextLine();
        // System.out.println(l);
        // while (scanner.hasNext()) {
        //     l = scanner.nextLine();
        //     System.out.println(l);
        // }
        // System.out.println("------------------");

        String[] arr = new String[36];
        int i = 0;
        // scanner = new Scanner(myObj);
        while (scanner.hasNext()) {
            arr[i] = scanner.next();
            i++;
        }
        int c = 0;
        int[] arrNum = new int[36];
        for (int x = 0; x < arr.length; x ++) {
            arrNum[x] = Integer.parseInt(arr[x]);
            if (arrNum[x] != 0) {
                c++;
            }
        }
        // System.out.println("c=" + c);
        int q = 0;
        int[] noZeros = new int[c];
        for (int x = 0; x < arrNum.length; x++) {
            if (arrNum[x] != 0) {
                noZeros[q] = arrNum[x];
                q++;
            }
        }
        Arrays.sort(noZeros);
        for (int j = 0; j < noZeros.length; j++ ) {
            // System.out.print(noZeros[j]);
        }
        // System.out.println("------");
        int sum = 0;
        for (int j = noZeros.length-1; j > 7; j-- ) {
            // System.out.print(noZeros[j]);
            sum += noZeros[j];
        }
        // System.out.println("----");
        System.out.println(sum);

        scanner.close();
    }
}
