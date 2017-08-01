/* Problem - https://www.hackerrank.com/challenges/magic-square-forming
   Solution
   Initialize all 8 possible magical squares.
   Find cost of converting given matrix s to magic square for all possible squares
   Print min cost
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int costToConvert(int[][] a, int[][] b){
        int cost = 0;
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                cost = cost + Math.abs(a[i][j] - b [i][j]);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int[][][] m = {{{4,9,2},{3,5,7},{8,1,6}} , {{8,1,6},{3,5,7},{4,9,2}} , {{4,3,8},{9,5,1},{2,7,6}} , {{2,7,6},{9,5,1},{4,3,8}} ,
                       {{2,9,4},{7,5,3},{6,1,8}} , {{6,1,8},{7,5,3},{2,9,4}} , {{6,7,2},{1,5,9},{8,3,4}} , {{8,3,4},{1,5,9},{6,7,2}}};

        int cost_min  = costToConvert(m[0],s);
        for(int i = 1; i < 8; i++){
            int temp = costToConvert(m[i],s);
            if(temp<cost_min) cost_min = temp;
        }
        System.out.println(cost_min);
        //  Print the minimum cost of converting 's' into a magic square
    }
}
