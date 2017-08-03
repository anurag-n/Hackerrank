/* Problem - https://www.hackerrank.com/challenges/extra-long-factorials
 * This problem basically wants to introduce us to "BigIntegers"
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static BigInteger factorialOf(int n){
        BigInteger f = new BigInteger("1");
        for(int i = 2; i <=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorialOf(n));
    }
}