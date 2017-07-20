/*Problem - https://www.hackerrank.com/challenges/cats-and-a-mouse
 *Solution
Distance between 2 points a and b = abs(a-b)
Whichever cat(x or y) has least distance from the mouse(z), that cat wins
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static String cat_mouse(int x, int y, int z){

		if(Math.abs(x-z)<Math.abs(y-z)) return "Cat A";
		else if(Math.abs(x-z)>Math.abs(y-z)) return "Cat B";
		else return "Mouse C";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(cat_mouse(x,y,z));
        }
    }
}
