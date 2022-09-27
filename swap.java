import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int[] arr=new int[m];
		int[] brr=new int[n];
		int[] crr=new int[m+n];
		for(int i=0;i<m;i++)
		{
		    arr[m]=sc.nextInt();
		}
		    for(int j=0;j<n;j++)
		    {
		        brr[n]=sc.nextInt();
		    }
		        int i=0,j=0,k=0;
		        while(i<m&&j<n)
		        {
		            if(arr[i]<brr[j])
		            {
		                crr[k]=arr[i];
		                i=i+1;
		                k=k+1;
		            }
		                else
		                {
		                    crr[k]=brr[j];
		                    j=j+1;
		                    k=k+1;
		                }
		        }
		            while(i<m)
		            {
		                crr[k]=arr[i];
		                k=k+1;
		                i=i+1;
		            }
		                while(j<n)
		                {
		                    crr[k]=brr[j];
		                    k=k+1;
		                    j=j+1;
		                }
	}
}
