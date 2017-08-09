/* Problem - https://www.hackerrank.com/challenges/queens-attack-2/problem
 * Solution
 * All squares which the queen can travel to lie on the lines x = cQueen, y = rQueen, x+y = cQueen + rQueen. x-y = cQueen-rQueen
 * Using this bit of information we can find all obstacles that lie on these lines, subtract the coordinare of
 * the nearest obstacle from that of queen's to get max no. of squares the queen can travel on that line in one direction.
 * We do likewise for all 8 directions on 4 lines to and sum the results to get the final result
 * Time Complexity = O(k)
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
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int x1 = cQueen - 1;
        int x2 = n - cQueen;
        int y1 = rQueen - 1;
        int y2 = n - rQueen;
        int d11 = rQueen + cQueen >= n+1 ? n-rQueen : cQueen - 1;
        int d12 = rQueen + cQueen >= n+1 ? n-cQueen : rQueen - 1;
        int d21 = rQueen >= cQueen ? n-rQueen : n-cQueen;
        int d22 = rQueen >= cQueen ? cQueen - 1 : rQueen - 1;   
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            // your code goes here
            if(!(rObstacle == rQueen && cObstacle == cQueen)){
                if(rObstacle == rQueen && cObstacle < cQueen) x1 = cQueen - cObstacle - 1 < x1 ? cQueen - cObstacle - 1 : x1;
                else if(rObstacle == rQueen && cObstacle > cQueen) x2 = cObstacle - cQueen - 1 < x2 ? cObstacle - cQueen - 1 : x2;
                else if(cObstacle == cQueen && rObstacle < rQueen) y1 = rQueen - rObstacle - 1 < y1 ? rQueen - rObstacle - 1 : y1;
                else if(cObstacle == cQueen && rObstacle > rQueen) y2 = rObstacle - rQueen - 1 < y2 ? rObstacle - rQueen - 1 : y2;
                else if(rObstacle + cObstacle == rQueen + cQueen && rQueen + cQueen >= n+1){
                    if(rObstacle > rQueen) d11 = rObstacle - rQueen - 1 < d11 ? rObstacle-rQueen-1 : d11;
                    else d12 = rQueen - rObstacle - 1 < d12 ? rQueen-rObstacle-1 : d12;
                }
                else if(rObstacle + cObstacle == rQueen + cQueen && rQueen + cQueen < n+1){
                    if(rObstacle > rQueen) d11 = rObstacle-rQueen-1 < d11? rObstacle-rQueen-1 : d11;
                    else d12 = rQueen-rObstacle-1 < d12 ? rQueen-rObstacle-1 : d12; 
                }
                else if(rObstacle - cObstacle == rQueen - cQueen && rQueen >= cQueen){
                    if(rObstacle > rQueen) d21 = rObstacle-rQueen-1 < d21? rObstacle-rQueen-1 : d21;
                    else d22 = rQueen - rObstacle - 1 < d22 ? rQueen-rObstacle-1 : d22;
                }
                else if(rObstacle - cObstacle == rQueen - cQueen && rQueen < cQueen){
                    if(rObstacle > rQueen) d21 = rObstacle-rQueen-1 < d21? rObstacle-rQueen-1 : d21;
                    else d22 = rQueen - rObstacle - 1 < d22? rQueen - rObstacle - 1: d22;
                }
            }
        }
        System.out.println(x1+x2+y1+y2+d11+d12+d21+d22);
    }
}
