import java.util.*;
public class Counting {
    public static void main(String[] args) {
        int n,count =0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int max=0;
        for(int i=0;i<ar.length;i++)
        if(max<ar[i])
        max=ar[i];
        countingsort(ar,n,max);
    }
    public static void countingsort(int cd[],int n,int k)
    {
        int b[]=new int[n];
        for(int i=1;i<=3;i++)
        {
        int c[]=new int[k+1];
        for(int o=0;o<n;o++)
        c[cd[o]]++;
        for(int j=1;j<=k;j++)
        c[j]+=c[j-1];
        for(int l=n-1;l>=0;l--)
        {
        b[c[cd[l]]-1]=cd[l];
        c[cd[l]]--;
        }
    }
        for(int m=0;m<b.length;m++)
        System.out.print(b[m]+" ");
        
    
    }
    
}
