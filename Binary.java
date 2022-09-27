import java.util.*;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        Arrays.sort(ar);
        int c=sc.nextInt();
        int f=0;
        int l=ar.length-1;
      binarysearch(ar,f,l,c);
    }
    public static int binarysearch(int[]cd,int f,int l,int p)
    {
        int mid=(f+l)/2;
        while(f<=l)
        {
            if(cd[mid]<p)
            f=mid+1;
            else if(cd[mid]==p){
            System.out.println("Element found at"+(mid+1));
            break;
        }
        else
        l=mid-1;
        mid=(f+l)/2;
        if(f>l)
        System.out.println("Element not found");
    }
}
}
