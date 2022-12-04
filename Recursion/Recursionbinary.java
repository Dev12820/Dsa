import java.util.*;
public class Recursionbinary {
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
      System.out.print(binarysearch(ar,f,l,c));
    }
    public static int binarysearch(int []ar,int f,int l,int c)
   {
       if(f>l)
       return -1;
       int mid=(f+l)/2;
       if(ar[mid]==c)
       return mid ;
       else
       if(ar[mid]>c)
       return binarysearch(ar,f,mid-1,c);
       return binarysearch(ar,mid+1,l,c);
   }
}
