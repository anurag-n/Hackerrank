/* Problem - https://www.hackerrank.com/challenges/bigger-is-greater
 * Solution
 * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
   public static String sortString(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String res = new String(charArray);
        return res;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int k = 0; k < n; k++){
            String s = in.next();
            int i = s.length() - 1;
            while(i>0 && s.charAt(i-1) - 'a'>= s.charAt(i) - 'a'){
                i--;
            }
            if(i==0) System.out.println("no answer");
            else{
                int j = s.length() - 1;
                while(s.charAt(j) -'a' <= s.charAt(i-1) -'a') j--;
                System.out.println(s.substring(0,i-1)+s.charAt(j)+sortString(s.substring(i,j) + s.charAt(i-1) + s.substring(j+1)));
            }
        }
    }
}