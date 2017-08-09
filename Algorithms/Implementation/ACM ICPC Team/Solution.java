/* Problem - https://www.hackerrank.com/challenges/acm-icpc-team
 * Time Complexity - O(n^2 * m) Maybe we can do better
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int sumBinary(int m, String a, String b){
        int res = 0;
        for(int i = 0; i < m; i++){
            if(a.charAt(i) -'0' + b.charAt(i) - '0' > 0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int count = 0;
        int max_sum = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j<n;j++){
                int sum = sumBinary(m,topic[i],topic[j]);
                if(sum > max_sum){
                    max_sum = sum;
                    count = 1;
                }
                else if(sum == max_sum) count++;
            }
        }
        System.out.println(max_sum);
        System.out.println(count);
    }
}
