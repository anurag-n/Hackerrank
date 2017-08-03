/* Problem - https://www.hackerrank.com/challenges/sherlock-and-squares
 * Solution
 * Given two numbers a and b, number of squares between them = floor(sqrt(b)) - ceil(sqrt(a)) + 1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countSquares(int a, int b){
        int count = (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(countSquares(a,b));
        }
    }
}