/* Problem - https://www.hackerrank.com/challenges/the-grid-search
 * Solution
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String findPattern(String[] G, String[] P, int C, int c){
        for(int i = 0; i <= G.length - P.length; i++){
            for(int j = 0; j <= C-c; j++){
                int k = 0;
                while(k < P.length && G[i+k].substring(j,j+c).equals(P[k])) k++;
                if(k==P.length) return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            System.out.println(findPattern(G, P, C, c));
        }
    }
}