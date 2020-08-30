import java.io.*;
import java.util.*;

public class Fact {

	public static int fun(int n) {
		int result = 1;
		int y = 0;
		while (n > 0) {
			result *= n;
			n--;
		}
		return result;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int num = 342;
        int a = 0, b = 0, c = 0;
        a = num/100;
        num = num % 100;
        b = num / 10;
       	num = num % 10;
       	c = num;
        System.out.println(fun(a) + fun(b) + fun(c));
    }
}
