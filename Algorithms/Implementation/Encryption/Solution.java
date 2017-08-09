/* Problem - https://www.hackerrank.com/challenges/encryption
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s.replaceAll("\\s","");
        int n = s.length();
        int cols = (int) Math.ceil(Math.sqrt(n));
        for(int i = 0; i < cols; i++){
            for(int j = 0; i+j < n; j = j + cols){
                System.out.print(s.charAt(i+j));
            }
            System.out.print(" ");
        } 
    }
}
