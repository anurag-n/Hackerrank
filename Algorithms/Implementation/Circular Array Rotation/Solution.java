/* Problem - https://www.hackerrank.com/challenges/circular-array-rotation
 * Solution
 * After k rotations, the array looks like a[n-k], a[n-k+1]...,a[n-1],a[1],a[2]...a[n-k-1].
 * if k > n, k = k%n and if k % n = 0, the array remains same
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int[] rotate(int[] a, int n, int k){
        if(k==0) return a;
        else{
            int[] rot_a = new int[n];
            int rot_a_i = 0;
            for(int i = n-k; i < n; i++){
                rot_a[rot_a_i] = a[i];
                rot_a_i++;
            }
            for(int i = 0; i < n-k; i++){
                rot_a[rot_a_i] = a[i];
                rot_a_i++;
            }
            return rot_a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        k= k%n;
        int[] rotate_a = rotate(a,n,k);
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(rotate_a[m]);
        }

    }
}
