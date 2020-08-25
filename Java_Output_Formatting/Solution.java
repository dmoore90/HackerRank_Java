import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
                String s1 = sc.next();
                int x = sc.nextInt();
                String s2 = sc.next();
                int x2 = sc.nextInt();
                String s3 = sc.next();
                int x3 = sc.nextInt();

            System.out.println("================================");
            System.out.printf(s1);
            System.out.printf("%15s %n", x);
            System.out.printf(s2);
            if (s2)
            System.out.printf("%15s %n", x2);
            System.out.printf(s3);
            System.out.printf("%15s %n", x3);
            System.out.println("================================");
    }
}

