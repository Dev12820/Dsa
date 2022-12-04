import java.util.*;
public class Selectionsort {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int t=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            if(ar[i]<ar[j])
            {
            t=ar[j];
            ar[j]=ar[i];
            ar[i]=t;
            }

        }
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+",");

    }
    
}
