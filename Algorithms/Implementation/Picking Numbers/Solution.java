/* Problem - https://www.hackerrank.com/challenges/picking-numbers
 * Solution
 For each ith element x in the sorted array a, if we create an array that contains difference between x and the next n-i numbers
 We then search the array for 0s and 1s
 1 + max number of 0s and 1s in any array is our result
 Time complexity - O(n^2)
 There is a better algo using divide and conquer that has complexity O(n logn) probably, still looking into it
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static int max = 0;
    public static void pick(int n, int[] a){
        int[] rec_diff = new int[n-1];
        int temp_max = 0;
        for(int i = 0; i < n-1; i++){
            rec_diff[i] = a[i+1] - a[0];
            if(rec_diff[i] < 2) temp_max++;
        }
        if(temp_max > max) max = temp_max;
        if(n > 1) pick(n-1, rec_diff);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        pick(n,a);
        System.out.println(max+1);
    }
}