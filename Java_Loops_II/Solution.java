import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int x = 0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            x = a;
            for (int j = 0; j < n; j++){
                x += (int)Math.pow(2,j) * b;
                System.out.print(x + " ");        
            }
            System.out.println("");   
        }
        in.close();
    }
}