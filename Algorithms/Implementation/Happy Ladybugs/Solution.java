/* Problem - https://www.hackerrank.com/challenges/happy-ladybugs
 * Solution
 * We just need to check if there is atleast 1 '_' in the String and there are more than 1 ladybugs of same type
 * If that is the case, the ladybugs can be made happy else NO
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String allHappy(String b){
        String temp = "";
        if(!b.contains("_")){
            if(b.length() == 1 || b.charAt(0) != b.charAt(1) || b.charAt(b.length()-2) != b.charAt(b.length()-1)) return "NO";
            for(int i = 1; i < b.length()-1; i++){
                if(b.charAt(i) != b.charAt(i+1) && b.charAt(i) != b.charAt(i-1)) return "NO";
            }
            return "YES";
        }
        for (int i = 0; i < b.length(); i++) {
        if (temp.indexOf(b.charAt(i)) == -1 && b.charAt(i) != '_') temp = temp + b.charAt(i);
        }
        int[] count_colours = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            for(int j = 0; j < b.length(); j++){
                if(temp.charAt(i) == b.charAt(j)) count_colours[i]++;
            }
        }
        for(int i = 0; i < count_colours.length; i++){
            if(count_colours[i] == 1) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            System.out.println(allHappy(b));
        }
    }
}
