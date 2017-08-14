/* Problem - https://www.hackerrank.com/challenges/beautiful-triplets
 * Solution
 * One - Simple 3 loops
 * Two - 
 * Create 3 arrays, input - 0d, input - 1d, input - 2d
 * Use binary search for each element in array 1 if it exists in array 2 and 3 as well
 * if it does, count++
 * return count
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                if(a[j] - a[i] > d) break;
                else if(a[j] - a[i] == d){
                    for(int k = j+1; k < n; k++){
                        if(a[k] - a[j] > d) break;
                        else if(a[k] - a[j] == d) count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}