import java.util.*;
public class Interp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        int c=sc.nextInt();
        int l=0;
        int h=n-1;
        int p=inter(ar,l,h,c);
        if (p!=-1)
        System.out.println("Element found at index"+p);
    else
        System.out.println("Element not found.");
    }
    public static int inter(int cd[],int l,int h,int c)
    {
        int m;

        if(l<= h && c>= cd[l] && c<= cd[h])
        {
            m =l+(((h- l)/(cd[h]-cd[l]))*(c - cd[l]));
            if (cd[m] ==c)
                return m;
            else if (cd[m] < c)
                return inter(cd,m+1,h,c);
 
            else if (cd[m] > c)
                return inter(cd,l,m-1,c);
        }

        return -1;
        }
    }

