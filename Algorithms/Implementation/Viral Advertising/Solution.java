/* Problem - https://www.hackerrank.com/challenges/strange-advertising
 * Solution - Piss easy. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double watched = 5;
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res + (int)Math.floor(watched/2);
            watched = Math.floor(watched/2) * 3;
        }
        System.out.println(res);
    }
}