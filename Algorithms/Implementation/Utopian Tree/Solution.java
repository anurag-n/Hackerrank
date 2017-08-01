/* Problem - https://www.hackerrank.com/challenges/utopian-tree
 * Solution
 * Straightforward solution, if i % 2==0, spring cycle- result is multiplied by 2
 * 							 if i % 2 == 1, summer cycle, result = result + 1
 * Interesting thing to note in this problem is that the answer follows a bit pattern
 * Year 1 (2) -  3 -     11
 * Year 2 (4) -  7 -    111
 * Year 3 (6) - 15 -   1111
 * Year 4 (8) - 31 -  11111
 * Year 5(10) - 63 - 111111
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int height(int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            if(i%2==0) result *= 2;
            else result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(height(n));
        }
        
    }
}