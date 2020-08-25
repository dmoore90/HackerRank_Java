import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	File myObj = new File("/home/r34p3r/env_java/hackerrank/Java_End-of-file/test.txt");
        Scanner sc = new Scanner(myObj);
        String line = sc.nextLine();
        int count = 1;
        System.out.println(count + " " + line);
        while (sc.hasNext()) {
        	count ++;
        	line = sc.nextLine();
        	System.out.println(count + " " + line);
        }
    }
}