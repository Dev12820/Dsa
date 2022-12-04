import java.util.*;
public class Union {
    public static void main (String[] args) throws java.lang.Exception
    {
            int m,n;
            Scanner sc=new Scanner(System.in);
            m=sc.nextInt();
            n=sc.nextInt();
            int[] arr=new int[m];
            int[] brr=new int[n];
            int[] crr=new int[m+n];
            for(int i=0;i<m;i++)
                arr[i]=sc.nextInt();
                for(int j=0;j<n;j++)
                    brr[j]=sc.nextInt();
                    int i=0,j=0,k=0;
                    while(i<m&&j<n)
                    {
                        if(arr[i]<brr[j])
                        
                            crr[k++]=arr[i++];
                           else if(brr[j]<arr[i])
                           crr[k++]=brr[j++];
                           else
                           {
                           crr[k++]=arr[i++];
                           j++;
                           }    
                    }
                        while(i<m)
                        {
                            crr[k]=arr[i];
                            k=k+1;
                            i=i+1;
                        }
                            while(j<n)
                            {
                                crr[k]=brr[j];
                                k=k+1;
                                j=j+1;
                            }
                            for(int z=0;z<k;z++)
                            System.out.print(crr[z]+" ");
                        }
    
}
