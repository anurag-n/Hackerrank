/* Problem - https://www.hackerrank.com/challenges/library-fine
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int fine(int d, int m, int y){
        if(y>0) return 10000;
        else if(y<0) return 0;
        else{
            if(m>0) return 500*m;
            else if(m < 0) return 0;
            else{
                if(d>0) return 15*d;
                else return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int d = d1-d2;
        int m = m1-m2;
        int y = y1-y2;
        System.out.println(fine(d,m,y));
    }
}
