/* Problem - https://www.hackerrank.com/challenges/save-the-prisoner
Important thing to note in this problem is when m+s-1 is exactly divisible by n, we need to print n
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        int k = (m+s-1)%n;
        if(k == 0) return n;
        else return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
