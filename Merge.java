import java.util.*;
public class Merge {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[] =new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Merge m1 = new Merge();
        mergesort(ar,0,n-1);
        for(int t=0;t<ar.length;t++)
        System.out.print(ar[t]+",");
    }
    public static void mergesort(int cd [],int beg, int end)
    {
        int mid;
        if(beg<end)
        {
            mid=(beg+end)/2;
            mergesort(cd,beg,mid);
            mergesort(cd,mid+1,end);
            merge(cd,beg,mid,end);
        }


    }
     public static void merge(int cd[],int beg,int mid,int end)
    {
        int la[]=new int[mid-beg+1];
        int ra[]=new int[end-mid];
        for(int i=0;i<la.length;i++)
        la[i]=cd[beg+i];
        for(int j=0;j<ra.length;j++)
        ra[j]=cd[mid+1+j];
        int i=0;
        int j=0;
        int k=beg;
        while(i<la.length&&j<ra.length)
        {
            if(la[i]<=ra[j])
            cd[k++]=la[i++];
            else
            cd[k++]=ra[j++];
        }
            while(i<la.length)
            cd[k++]=la[i++];
            while(j<ra.length)
            cd[k++]=ra[j++];
        }
        
    }
    
