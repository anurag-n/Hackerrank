/* Problem - https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 * Solution
 * Straightforward solution, all we need is a function to reverse the numbers
 * Let's say we have a number xyz, where x,y,z are the digits.
 * xyz%10 = z and xyz/10 = xy. We can recurse this until 0 to obtain the digits of the number 
 * and put them in a variable which we multiply by 10 each time.  
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int reversed(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
        
    }
    
    public static int countBeautiful(int i, int j, int k){
        int count = 0;
        for(int a0 = i; a0 <= j; a0 ++){
            int rev_a0 = reversed(a0);
            if(Math.abs(a0-rev_a0)%k == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        System.out.println(countBeautiful(i,j,k));
    }
}