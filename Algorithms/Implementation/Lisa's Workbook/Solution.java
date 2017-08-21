/* Problem - https://www.hackerrank.com/challenges/lisa-workbook/problem
 * Solution
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countSpecialProblems(int page_num, int start, int end){
        int res = 0;
        for(int i = start; i <= end; i++){
            if(page_num == i) res = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] problems = new int[n];
        for(int i = 0; i < n; i++){
            problems[i] = in.nextInt();
        }
        int page_counter = 1;
        int sp_prob = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (int) Math.ceil((float) problems[i]/k); j++){
                int start = j*k + 1;
                int end = (j+1)*k <= problems[i] ? (j+1)*k : problems[i];
                sp_prob += countSpecialProblems(page_counter,start,end);
                page_counter++;
            }
        }
        System.out.println(sp_prob);
    }
}
       