/* Problem - https://www.hackerrank.com/challenges/kaprekar-numbers
 * Solution
 * All we need is the number of digits d in the number
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isKaprekar(long num){
        long num_sq = num * num;
        int d = 0;
        long n = num;
        while(n > 0){
            n = n/10;
            d++;
        }
        long r = num_sq%(long)Math.pow(10,d);
        long l = num_sq/(long)Math.pow(10,d);
        return (l+r == num);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int count = 0;
        for(long i = p; i <=q; i++){ 
            if(isKaprekar(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        if(count == 0) System.out.println("INVALID RANGE");
    }
}