/* Problem - https://www.hackerrank.com/challenges/equality-in-a-array
 * Solution
 * We just need to find the maximum of the frequency of all the distinct elements and subtract from n
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        List <Integer> arr_aslist = Arrays.asList(arr);
        int max_freq = 0;
        int count = 0;
        while(count<n){
            int frequency = Collections.frequency(arr_aslist, arr[count]);
            count += frequency;
            if(frequency > max_freq) max_freq = frequency;
        }
        System.out.println(n-max_freq);
    }
}