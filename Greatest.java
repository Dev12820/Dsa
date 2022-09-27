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
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n-->0)
		{
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if(a>b&&a>c)
		    System.out.println(a);
		    else if(b>a&&b>c)
		    System.out.println(b);
		    else
		    System.out.println(c);
		        
		    
		}
	}
}


