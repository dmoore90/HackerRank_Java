import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("/home/r34p3r/env_java/hackerrank/Java_Subarray/test.txt");
        Scanner sc = new Scanner(myObj);

        int l = sc.nextInt();
        int[] a = new int[l];
        int i = 0;
        while (sc.hasNext()) {
            a[i] = sc.nextInt();
            i++;
        }
        // for (int x = 0; x < l; x++) {
        //     System.out.println(a[x]);
        // }
        int nl = l* (l+1) / 2;
        int[] sum = new int[nl];
        
        int b=1;
        int c = 0;
        for (i = 0; i < l-1; i++) {
            sum[i] = a[i] + a[i+1];
            c++;
            if (i == l-2) {
                for (i=0; i < l-2; i++) {
                    sum[c] = a[i] + a[i+1] + a[i+2];
                    c++;
                    if (i == l-3) {
                        for (i=0; i<l-3; i++) {
                            sum[c] = a[i] +a[i+1] + a[i+2] + a[i+3];
                            c++;
                            if (i == l-4) {
                                for (i=0; i<l-4; i++) {
                                    sum[c] = a[i] + a[i+1] + a[i+2] + a[i+3] + a[i+4];
                                    c++;    
                                } 
                            }
                        }
                    }
                }
            }
        }
        for (i=0; i < a.length; i++) {
            if (a[i] < 0) {
                sum[c] = a[i];
                c++;
            }
        }
        int nsum = 0;
        for (i = 0; i < sum.length; i++) {
            if (sum[i] < 0) {
                // System.out.print(sum[i] + "|");
                nsum ++;  
            }
        }
        System.out.println(nsum);

    }
}