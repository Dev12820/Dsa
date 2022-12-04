/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
	int n,p=0,i,z,m;
		int[] arr=new int[7];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		    for(i=0;i<n;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		           
		            if(arr[j]<arr[i])
		            {
		                m=arr[i];
		                arr[i]=arr[j];
		                arr[j]=m;
		            }
		        }
		    }
	            for(i=0;i<n;i++)
	            {
	                p=p+arr[i];
	            }
	            m=((n+1)*(n+2))/2;
	            z=m-p;
	            System.out.println(z);
	}
}


