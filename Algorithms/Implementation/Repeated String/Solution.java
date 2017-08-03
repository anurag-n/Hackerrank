/* Problem - https://www.hackerrank.com/challenges/repeated-string
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
        long n = in.nextLong();
        long d = n / s.length();
        long r = n % s.length();
        long count_s = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count_s += d;
                if(i < r) count_s++;
            }
        }
        System.out.println(count_s);
        
    }
}
