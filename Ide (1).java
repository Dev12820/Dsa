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
		System.out.println("Enter the number");
		    p=sc.nextInt();
		    for(int j=n-1;j>1;j--)
		    {
		        arr[j+1]=arr[j];
		        arr[j]=p;
		    }
		    n=n+1;
		    for(int j=0;j<n;j++)
		    {
		        System.out.println(arr[j]);
		    }
	}
}


