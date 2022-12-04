#include<stdio.h>
void main()
{
    int a[10],i,n;
    scanf("%d",&n);
    printf("Enter array");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
   printf("%d",max(a,n));
    printf("%d",min(a,n));
}
 max(int b[],int n)
 {
    int max=b[0];
    for(int i=1;i<n;i++)
    {
        if(max<b[i])
        max=b[i];
    }
    return max;
 }
 min(int b[],int n)
 {
    int min=b[0];
    for(int i=1;i<n;i++)
    {
        if(min>b[i])
        min=b[i];
    }
    return min;
 }