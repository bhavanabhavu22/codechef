import java.util.*;
import java.lang.*;
import java.io.*;


class WATERCONUMPTION
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases
        for (int i = 0; i < t; i++) { // Loop through each test case
            int x = sc.nextInt(); // Read the amount of water drank
            if (x >= 2000) {
                System.out.println("YES"); // Print YES if Chef followed the advice
            } else {
                System.out.println("NO");}
        }
	}
}

