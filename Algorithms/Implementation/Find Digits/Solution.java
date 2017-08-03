/* Problem - https://www.hackerrank.com/challenges/find-digits
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countDivDigits(int n){
        int count = 0;
        int number = n;
        while(number!=0){
            int digit = number%10;
            if(digit!=0 && n%digit == 0) count++;
            number = number/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(countDivDigits(n));
        }
    }
}