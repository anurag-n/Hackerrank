/* Problem - https://www.hackerrank.com/challenges/organizing-containers-of-balls
 * Solution
 * Since we can only perform swaps, the size of all containers remains same always
 * Which means if Container A has 4 balls of any type, it will always have 4 balls
 * Since in the end, we want all balls of same type to be in 1 container, the size of that
 * container which will eventually contain balls of let's say type 1 has to be equal 
 * to the number of type 1 balls. This means for our organization to be successful, the distribution
 * of number of balls of each type and the size of each container has to be same. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String isPossible(int n, int[][] M){
        int[] n_balls = new int[n];
        int[] container_size = new int[n];
        for(int i =0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + M[j][i];
            }
            n_balls[i] = sum;
        }
        for(int i =0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + M[i][j];
            }
            container_size[i] = sum;
        }
        Arrays.sort(n_balls);
        Arrays.sort(container_size);
        boolean x = true;
        for(int i = 0; i < n; i++){
            x = x && (container_size[i] == n_balls[i]);
        }
        if(x) return "Possible";
        else return "Impossible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            System.out.println(isPossible(n, M));
        }
    }
}
