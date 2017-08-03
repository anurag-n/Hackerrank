/* Problem - https://www.hackerrank.com/challenges/append-and-delete/problem
 * Solution 
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        if(k>=s.length()+t.length()) System.out.println("Yes");
        else{
            int count = 0;
            while(count < s.length() && count < t.length() && s.charAt(count) == t.charAt(count)) count++;
            int h = k - (s.length() + t.length() - 2*count);
            if(h % 2 == 0 && h >= 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}