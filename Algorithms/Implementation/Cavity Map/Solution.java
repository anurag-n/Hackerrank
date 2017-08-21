/* Problem - https://www.hackerrank.com/challenges/cavity-map
 * Solution
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String replaceX(String[] grid, int count){
        if(count == 0 || count == grid[0].length()-1) return grid[count];
        else{
            char[] temp = grid[count].toCharArray();
            for(int i = 1; i < grid[0].length()-1; i++){ 
                if(temp[i] - '0' > temp[i+1] -'0' && temp[i] - '0' > temp[i-1] - '0' && temp[i] -'0' > grid[count-1].charAt(i) - '0' && temp[i] - '0' > grid[count+1].charAt(i) - '0') temp[i] = 'X';
                }
            return String.valueOf(temp);
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        for(int i = 0; i < n; i++){
            System.out.println(replaceX(grid,i));
        }
        
    }
}
