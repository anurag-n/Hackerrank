/* Problem - https://www.hackerrank.com/challenges/flatland-space-stations
 * Solution
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static int findMaxDist(int n, int m, int[] station){
        int res = 0;
        if(m==1) res = station[0] > n-station[0]-1 ? station[0] : n-station[0]-1;
        else{
           res = station[0] > n-station[m-1]-1 ? station[0] : n-station[m-1]-1;
           for(int i = 0; i < m-1; i++){
               int temp = (int)Math.floor((float) (station[i+1] - station[i])/2);
               res = res > temp ? res : temp;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] station = new int[m];
        for(int i = 0; i < m; i++) station[i] = in.nextInt();
        Arrays.sort(station);
        System.out.println(findMaxDist(n,m,station));
    }
}