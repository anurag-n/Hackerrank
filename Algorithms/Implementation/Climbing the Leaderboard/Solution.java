/* Problem - https://www.hackerrank.com/challenges/climbing-the-leaderboard
 * Solution
 First, we convert the scores array to another sorted array with distinct values. 
 Now all we need to do is do a binary search on this array to find the rank.
 We save previous rank so that we don't have to traverse through the starting redundant values.
 Time Complexity  = O(m*logn) (Actually we are going to do better than that)
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int find_rank(int score, Integer[] scores, int l, int r){
        if(r>l){
            int mid = (l+r)/2;
            if(score==scores[mid]) return mid+1;
            else if(score>scores[mid]) return find_rank(score, scores, mid+1, r);
            else return find_rank(score, scores, l, mid-1);
        }
        else{
            if(score>=scores[l]) return l+1;
            else return l;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        List <Integer> list = new ArrayList <Integer>();
        for(int i = 0; i < scores.length; i++){
            list.add(scores[i]);
        }
        Set <Integer> scores_un = new TreeSet <Integer> (list);
        Integer[] ar_scores_un = scores_un.toArray(new Integer[scores_un.size()]);
        int m = in.nextInt();
        int[] alice = new int[m];
        int k = ar_scores_un.length;
        int prev_rank = 0;
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            int result = find_rank(alice[alice_i], ar_scores_un, prev_rank >k-1? k-1 : prev_rank,k-1);
            prev_rank = result;
            System.out.println(k- result + 1);
        }
    }
}