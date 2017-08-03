/* Problem - https://www.hackerrank.com/challenges/taum-and-bday
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long minCost(long b, long w, long x, long y, long z){
        long x2= y+z < x ? y+z : x;
        long y2 = x+z < y ? x+z : y;
        return (b*x2 + w*y2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            System.out.println(minCost(b,w,x,y,z));
        }
    }
}
