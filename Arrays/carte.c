#include<stdio.h>
void main()
{
    int a[10],b[10],n,m;
     printf("Devansh Singh");
    printf("\n2100320100061");
    printf("\nEnter the size of First Array");
    scanf("%d",&n);
    printf("\nEnter the size of Second Array");
    scanf("%d",&m);
    printf("\nEnter array 1");
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("\nEnter array 2");
    for(int i=0;i<m;i++)
    scanf("%d",&b[i]);
    printf("\nThe Cartesian product is ");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
    printf("(%d %d)",a[i],b[j]);
    }
}