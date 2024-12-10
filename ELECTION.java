import java.util.*;
import java.lang.*;
import java.io.*;

public class ELECTION
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>=2*y)
		{
		    System.out.println("yes");
		   } else{
		        System.out.println("no");
		   }
	}
}

