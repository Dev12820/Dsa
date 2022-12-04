import java.util.*;
import java.lang.*;
import java.io.*;
class del
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		int n,p,i;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		    p=sc.nextInt();
		    for(int j=p+1;j<n;j++)
		    {
		        arr[j-1]=arr[j];
		        
		    }
		    n=n-1;
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[j]+" ");
		    }
	}
}


