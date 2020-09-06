import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String word = "";
        String nl = "";
        String tag = "";
        String tag1 = "";
		while(testCases>0){
			String line = in.nextLine();
            // String target = line.replaceAll("<[^>]*>", "");
            int c = 0;
            int j = 0;
            while (c < line.length()) {
                // Captures first tag
                if (line.charAt(c) == '<' && line.charAt(c+1) != '/') {
                    c++;
                    while (line.charAt(c) != '>') {
                        tag += Character.toString(line.charAt(c));
                        c++;
                    }
                    c++;
                    j = c;
                // Captures second tag
                } else if (line.charAt(c) == '<' && line.charAt(c+1) == '/') {
                    c+=2;
                    while (line.charAt(c) != '>') {
                        tag1 += Character.toString(line.charAt(c));
                        c++;
                    }
               // Prints characters in between tags if equal
               if (tag.equals(tag1)) {
                   if (line.charAt(j) == '<' && line.charAt(j+1) != '/') {
                        while(line.charAt(j) != '>') {
                            j++;
                        }
                        j++;
                   }
                   if (line.charAt(j) != '<') {
                        while (line.charAt(j) != '<') {
                            nl += Character.toString(line.charAt(j));
                            j++;
                        }
                   }

               } else {
                   nl = "None";
               }
               System.out.println(nl);
               nl = "";
               tag = "";
               tag1 = "";
                // break;
                } 
                c++;
            }
			testCases--;
            // break;
		}
	}
}
