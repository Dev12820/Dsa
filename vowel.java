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
		char n;
		Scanner sc=new Scanner(System.in);
		n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		System.out.println("vowel");
		else if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
		System.out.println("vowel");
		else
		System.out.println("Consonant");
	}
}


