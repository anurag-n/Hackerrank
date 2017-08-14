/* Problem - https://www.hackerrank.com/challenges/chocolate-feast
 * Solution
 * Important thing to note in this problem is that we don't throw away the unused wrappers after each iteration
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countChoc(int n, int c, int m){
        int count = n/c;
        n = count;
        int extra = 0;
        while(n>0){            
            count = count + (extra+n)/m;
            int temp = (extra + n)/m;
            extra = (extra + n)%m;
            n = temp;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            System.out.println(countChoc(n,c,m));
        }
    }
}
