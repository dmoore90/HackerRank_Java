import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String zeroto255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    String pattern = zeroto255 + "\\." + zeroto255 + "\\." + zeroto255 + "\\." + zeroto255;
}

