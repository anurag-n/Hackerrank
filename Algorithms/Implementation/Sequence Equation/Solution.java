/* Problem - https://www.hackerrank.com/challenges/permutation-equation
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] p = new Integer[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        Arrays.sort(p);
        List<Integer> p_list = Arrays.asList(p);
        for(int p_i = 0; p_i < n; p_i++){
            System.out.println(p_list.indexOf(p_list.indexOf(p[p_i])+1)+1);
        }
    }
}
