import java.util.*;


public class Jump {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        Arrays.sort(ar);
        int c=sc.nextInt();
        int step=(int)Math.sqrt(ar.length-1);
        int mid=0;
        System.out.println(jumpp(ar,c,step,mid)+1);
        
        
    }
    public static int jumpp(int cd[],int c,int step,int mid)
    {
        
        if(cd[mid]==c)
        return mid;
        else if(cd[mid]<c)
        {
        mid+=step;
        return jumpp(cd,c,step,mid);
        }
        else
        {
        for(int i=mid-step;i<mid+step;i++)
        {
        if(cd[i]==c)
        return i;
        }
        return -1;
        }

    }
    
}
