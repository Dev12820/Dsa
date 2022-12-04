#include <stdio.h>
#include<stdlib.h>
int main()
{
    int n;
    int ar[10];
    int i;
    int k;
    scanf("%d",&n);
    for( i=0;i<n;i++)
    scanf("%d",&ar[i]);
    scanf("%d",&k);
    indexseq(ar,n,k);

}
void indexseq(int ar[],int n,int k)
{
    int GN=3;
    int element[GN],indexes[GN];
    int i,start,end;
    int j=0,ind=0,set=0;
    for(i=0;i<n;i+=3)
    {
        element[ind]=ar[ind];
        indexes[ind]=i;
        ind++;
    }
    if(k<ar[0])
    {
        printf("Not found");
        exit(0);
    }
    else {
        for(i=1;i<=ind;i++)
        {
            if(k<=element[i])
            {
                start=indexes[i-1];
                end=indexes[i];
                set=1;
                break;
            }
        }

    }
    if(set==0)
    {
        start=indexes[GN-1];
        end=GN;
    }
    for(i=start;i<=end;i++)
    {
        if(k==ar[i])
        j=1;
        break;
    }
    if(j==1)
    printf("YES");
    else
    printf("NO");
}