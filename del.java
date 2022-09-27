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
		
		int n,p,i;
		int[] arr=new int[7];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		    p=arr[3];
		    for(int j=3+1;j<n;j++)
		    {
		        arr[j-1]=arr[j];
		        
		    }
		    n=n-1;
		    System.out.println(n);
		    for(int j=0;j<n;j++)
		    {
		        System.out.println(arr[j]);
		    }
	}
}


