/* Problem - https://www.hackerrank.com/challenges/jumping-on-the-clouds
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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int cloud_i = 0;
        int steps = 0;
        while(cloud_i < n - 2){
            if(c[cloud_i+2] == 0 ) cloud_i += 2;
            else cloud_i++;
            steps++;
        }
        if(cloud_i != n-1) steps++;
        System.out.println(steps);
        
    }
}
