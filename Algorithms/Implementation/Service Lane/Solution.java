/* Problem - https://www.hackerrank.com/challenges/service-lane
 * Solution 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int minWidth(int i, int j, int[] width){
        int min = 3;
        for(int width_i = i; width_i <= j; width_i++){
            if(width[width_i] < min) min = width[width_i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(minWidth(i,j,width));
        }
    }
}
