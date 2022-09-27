/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int n;
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		    for(int j=0;j<n;j++)
		    {
		        System.out.println(arr[j]);
		    }
	}
}


