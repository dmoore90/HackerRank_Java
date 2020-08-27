import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
class Result {


    public static String findDay(int month, int day, int year) {
        String t = "";
        String theDay = "";
        String d;
        
        TimeZone tz = TimeZone.getTimeZone("PDT");
        Calendar cal = Calendar.getInstance(tz);
        cal.set(year, month-1, day);
        t = cal.getTime().toString();
        for (int i = 0; i < 3; i++) {
            theDay += t.charAt(i);
        }
        if (theDay.equals("Mon")) { theDay = "MONDAY"; }
        if (theDay.equals("Tue")) { theDay = "TUESDAY"; }
        if (theDay.equals("Wed")) { theDay = "WEDNESDAY"; }
        if (theDay.equals("Thu")) { theDay = "THURSDAY"; }
        if (theDay.equals("Fri")) { theDay = "FRIDAY"; }
        if (theDay.equals("Sat")) { theDay = "SATURDAY"; } 
        if (theDay.equals("Sun")) { theDay = "SUNDAY"; }
        return theDay;
        
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}