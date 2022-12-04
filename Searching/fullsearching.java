import java.util.*;
public class Linear
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        ar[i]=sc.nextInt();
        int c=sc.nextInt();
        Arrays.sort(ar);
        int f=0;
        int l=ar.length-1;
      System.out.println("linear search="+linearsearch(ar,c));
      System.out.println("binary search=");
      binarysearch(ar,f,l,c);
      System.out.println("Ternary search");
      int p=ternary(ar,f,l,c);
       System.out.println(p);
       int step=(int)Math.sqrt(ar.length-1);
        int mid=0;
        System.out.println("Jump search");
        System.out.println(jumpp(ar,c,step,mid)+1);
        System.out.println("Interpolation search");
        int t=inter(ar,f,l,c);
        if (t!=-1)
        System.out.println("Element found at index"+t);
    else
        System.out.println("Element not found.");
        System.out.println("Index sequential search");
        indexsearch(ar,c);
        System.out.println("Exponential search");
        int z=exposearch(ar,ar.length,c);
      System.out.print(z);

    }
    public static int linearsearch(int[]cd,int p)
    {
        for(int j=0;j<cd.length;j++)
        {
        if(cd[j]==p)
        return j;
    }
    return -1;
}
public static int binarysearch(int[]cd,int f,int l,int p)
    {
        int mid=(f+l)/2;
        while(f<=l)
        {
            if(cd[mid]<p)
            f=mid+1;
            else if(cd[mid]==p){
            System.out.println("Element found at"+(mid));
            break;
        }
        else
        l=mid-1;
        mid=(f+l)/2;
        if(f>l)
        System.out.println("Element not found");
    }
    return 0;
}
public static int ternary(int []cd,int f,int h,int c)
    {
        int mid1=f+(h-f)/3;
        int mid2=h-(h-f)/3;
        if(h>=f)
        {
            if(cd[mid1]==c)
            return mid1;
            else if(cd[mid2]==c)
            return mid2;
            else if(c<cd[mid1])
             return ternary(cd,f,mid1-1,c);
            else if(c>cd[mid2])
            return ternary(cd,mid2+1,h,c);
            else
            return ternary(cd,mid1+1,mid2-1,c);
        }
        else
            return -1;
        }
        public static int jumpp(int cd[],int c,int step,int mid)
    {
        
        if(cd[mid]==c)
        return mid-1;
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
        return i-1;
        }
        return -1;
        }

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
        public static void indexsearch(int[] ar,int s)
        {
            int m=ar.length/3,a=0;
            int l=(int) Math.ceil(m);
            
                    int arr[]=new int[l+1];
                    for(int i=0;i<ar.length;i+=3)
                    {
                        arr[a++]=i;
                    }
                    int j=0,f=0;;
                    while(j<l)
                    {
                        if(ar[arr[j]]==s)
                        {
                            f=1;
                            break;
                        }
                        else if(ar[arr[j]]<s)
                        {
                        j++;
                        if(j==l) 
                        for(int i=arr[j-1];i<ar.length;i++)
                        {
                            if(ar[i]==s)
                            {f=1;
                            j++;
                            break;
                            }
                        }
                    }
                    else
                    for(int i=arr[j];i<ar.length;i++)
                        {
                            if(ar[i]==s)
                            {
                                f=1;
                            j++;
                            break;
                            }
                        }
                    }
                    if(f==1)
                    System.out.println("Element found.");
                    else 
                    System.out.println("Element not found. ");
                }
             
             public static int exposearch(int cd[],int n,int c)
    {
        if(cd[0]==c)
        return 0;
        int i=1;
        while(i<c&&cd[i]<=c)
        i=i*2;
        return binarysearch(cd,i/2,Math.min(i,n-1),c);
    }
}
