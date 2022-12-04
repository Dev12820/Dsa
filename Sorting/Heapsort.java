import java.util.*;
public class Heapsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        buildheap(arr,n);
        for(int j=0;j<n;j++)
        System.out.print(arr[j]+" ");
    }
    public static void buildheap(int[] arr,int n)
    {
        for(int i=(n-2)/2;i>=0;i--)
        maxheapify(arr,n,i);
    }
    public static void maxheapify(int arr[],int n, int i)
    {
        int lar=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n&&arr[left]>arr[lar])
        lar=left;
        if(right<n&&arr[right]>arr[lar])
        lar=right;
        int swap=0;
        if(i!=lar)
        {
            swap=arr[i];
            arr[i]=arr[lar];
            arr[lar]=swap;
        }
    } 
}
