import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] chars1 = a.toLowerCase().toCharArray();
        char[] chars2 = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        String asort = new String(chars1);
        System.out.println(asort);

        String bsort = new String(chars2);
        System.out.println(bsort);
        boolean sol = false;
        if (asort.equals(bsort)) {
            sol = true;
        }
        return sol;
    }

  public static void main(String[] args) {
    
        // Scanner scan = new Scanner(System.in);
        // String a = scan.next();
        // String b = scan.next();
        // scan.close();
        String a = "Hello";
        String b = "hello";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

