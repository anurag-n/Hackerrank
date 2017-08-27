/* Problem - https://www.hackerrank.com/challenges/strange-code
 * Solution
 * Value of first term in each cycle = 3*2^(c-1)
 * time of last term in each cycle = 3*(2^n - 1)
 * Using this information, we can find the answer
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        double k = (double) t/3;
        double c = Math.ceil(Math.log(k + 1.0) / Math.log((double) 2)) - 1.0;
        long ans = (long) Math.floor(3*Math.pow(2,c) - (t - (3*(Math.pow(2,c)-1))));
        System.out.println(ans+1);
    }
}
