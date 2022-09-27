import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Ternary {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        Arrays.sort(ar);
        int c=sc.nextInt();
        int f=0;
        int h=ar.length-1;
       int p=ternary(ar,f,h,c);
       System.out.println(p);
    }
    public static int ternary(int []cd,int f,int h,int c)
    {
        int mid1=f+(h-f)/3;
        int mid2=h-(h-f)/3;
        if(h>=f)
        {
            if(cd[mid1]==c)
            {
            return mid1;
            
            
            }
            else if(cd[mid2]==c)
            {
            return mid2;
            
            }
            else if(c<cd[mid1])
            {
             return ternary(cd,f,mid1-1,c);
            }
            
            else if(c>cd[mid2])
            {
            return ternary(cd,mid2+1,h,c);
            }
            else
            return ternary(cd,mid1+1,mid2-1,c);
        }
        else
            return -1;
            
            
            
        
        }

    }

