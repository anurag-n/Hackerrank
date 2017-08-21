/* Problem - https://www.hackerrank.com/challenges/fair-rations
 * Solution
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countLoaf(int N, int[] B){
        int count = 0;
        int res = 0;
        while(count<N){
            if(B[count] % 2 == 1){
                for(int i = count+1; i < N; i++){
                    if(B[i] % 2 == 1){
                        res += i-count;
                        count = i+1;
                        break;
                    }
                    
                }
            }
            else count++;
        }
        return res*2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int check = 0;
        for(int i = 0; i < N; i++) check += B[i] % 2;
        if(check%2==1) System.out.println("NO");
        else System.out.println(countLoaf(N,B));
    }
}
