/* Problem - https://www.hackerrank.com/challenges/non-divisible-subset
 * Solution
 * The idea is that first we take % k for every element in S
 * Let's say we have k = 3 and we have 5 0s in the array, 3 1s and 2 2s
 * There can at max be one 0 and one k/2 (because if we have more the sum of those 2 numbers will be
 * divisible by k)
 * For the rest remainders from 1 to k/2, we take pairs of i and k-i and see which has lower frequency
 * Whichever has lower frequency, we delete all such values. Because there can only be 1 set of the 2
 * possible in the final subset (as i + k - i = k which makes a pair that is divisible by k)
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Integer[] s = new Integer [n];
        for(int s_i = 0; s_i < n; s_i++){
            s[s_i] = in.nextInt()%k;
        }
        int[] freq = new int[k];
        List<Integer> s_aslist = Arrays.asList(s);
        for(int i = 0; i < k; i++){
            freq[i] = Collections.frequency(s_aslist, i);
        }
        int count = freq[0] > 0 ? 1 : 0;
        if(k%2==0){
            count++;
            for(int i = 1; i < k/2; i++){
                count += freq[i] >= freq[k-i] ? freq[i] : freq[k-i]; 
            }
        }
        else{
            for(int i = 1; i < k/2 + 1; i++){
                count+= freq[i] >= freq[k-i] ? freq[i] : freq[k-i];
            }
        }
        System.out.println(count);
    }
}