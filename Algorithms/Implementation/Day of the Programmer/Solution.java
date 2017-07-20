/* Problem - https://www.hackerrank.com/challenges/day-of-the-programmer
 * Solution
We can simply check 3 different cases for the year - <1918, =1918, >1918
and provide results for each
Year < 1918 - Leap year - year % 4 == 0 - 12 Sept
			- Non leap - 13 Sept
Year > 1918 - Leap year - year % 4 == 0 & year % 100 /= 0 or year % 400 == 0 - 12 Sept
			- Non leap - 13 Sept
Year = 1918 - 26 Sept
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        if(year<=1917 && year%4==0) return "12.09."+year;
        else if(year<=1917 && year%4 != 0) return "13.09." + year;
        else if(year>1918 && ((year%4 ==0 && year%100 !=0) || year % 400 == 0)) return "12.09."+year;
        else if(year > 1918) return "13.09."+year;
        else return "26.09.1918";}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}