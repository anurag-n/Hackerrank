/* Problem - 
 * Solution
 * Striaghtforward question. All we need to find is the letter in the highlighted word
 * with the max height.
 * Note : In Java, if you subtract 'a' from the character, you get the albhaetic index. 
 * 		  Eg. 'd' - 'a' will return 3, 'a' - 'a' will return 0
 * This trick simplifies our problem as we can use i = difference between letter and 'a'
 * and h[i] is the required height.	
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static int hl_area(String word, int[] h){
		int len = word.length();
		int max_h = 0;
		for(int i =0; i < len; i++){
			if(h[word.charAt(i) - 'a'] > max_h) max_h = h[word.charAt(i) - 'a']; 
		}
		return max_h*len;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = hl_area(word,h);
        System.out.println(result);
    }
}
