import java.io.*;
import java.util.*;

public class Temp {

    public static void main(String[] args) {
        
        // Scanner sc=new Scanner(System.in);
        // String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String A = "madam";
        String B = "mister";

        String reversed = "";
        for (int i = A.length()-1; i >= 0; i--) {
            reversed += A.charAt(i);
        }

        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


