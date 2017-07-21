/* Problem - https://www.hackerrank.com/challenges/climbing-the-leaderboard
 * Solution
 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int ranking(int n, int score, int[] scores){
        int[] rankings = new int[n];
        int rank = 1;
        rankings[0] = rank;
        for(int i = 1; i < n; i++){
            if(scores[i] < scores[i-1]) rank++;
            rankings[i] = rank;
        }
        int final_rank = rankings[n-1] + 1;
        if(score >= scores[0]) final_rank = 1;
        else if(score == scores[n-1]) final_rank = rankings[n-1];
        else {
            for(int i = 1; i < n; i++){
                if(score>scores[i] && score<scores[i-1]) final_rank = rankings[i-1]+1;
                else if(score==scores[i]) final_rank = rankings[i];
            }
        }
        return final_rank;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            int result = ranking(n, alice[alice_i], scores);
            System.out.println(result);
        }
        // your code goes here
    }
}
