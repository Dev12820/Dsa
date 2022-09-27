import java.util.*;
public class Insertionsort {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int key=0;
        for(int i=1 ;i<n;i++)
        {
            key=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;


        }
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+",");

    }
    
}
