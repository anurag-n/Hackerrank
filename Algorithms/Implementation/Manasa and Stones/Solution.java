/* Problem - https://www.hackerrank.com/challenges/manasa-and-stones
 * Solution 
 * All the possible values on the final stone are 0*a+(n-1)*b, 1*a+(n-2)*b, 2*a+(n-3)*b,...,(n-1)*a+0*b.
 * We can just create a TreeSet to get the unique values in ascending order.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public void lastStone(int n, int a, int b){
        Set <Integer> res = new TreeSet <Integer>();
        for(int i = 0; i < n; i++){
                res.add(i*a + (n-i-1)*b);
        }
        StringJoiner joiner = new StringJoiner(" ");
        Iterator<Integer> itr = res.iterator();
        while(itr.hasNext()){
            joiner.add(itr.next().toString());
        }
        System.out.println(joiner.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int[] x = {1,2,3};
            new Solution().lastStone(n,a,b);
        }
    }
}