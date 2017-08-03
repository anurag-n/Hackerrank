/* Problem - https://www.hackerrank.com/challenges/cut-the-sticks
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        int count = n;
        while(count>0){
            System.out.println(count);
            int min = arr[n-count];
            for(int i =0; i < n; i++){
                arr[i] = arr[i] - min;
                if(arr[i] == 0) count--;
            }

        }
    }
}
