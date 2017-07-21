/* Problem - https://www.hackerrank.com/challenges/the-hurdle-race
 * Solution
 Simply calculate the maximum value in the array
 if max > k, max-k is the answer
 else 0 is the answer
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max_h = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max_h) max_h = height[height_i];
        }
        // your code goes here
        
        if(max_h > k) System.out.println(max_h - k);
        else System.out.println(0);
    }
}