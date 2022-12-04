#include<stdio.h>
#include<math.h>
void main()
{
    int a[10],n;
    printf("Devansh Singh");
    printf("\n2100320100061");
    printf("\nEnter the size of Array");
    scanf("%d",&n);
    printf("Enter array");
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    int t=pow(2,n);
    int counter=0,j;
    printf("\nPower set of array is ");
    printf("{");
    for(counter=0;counter<t;counter++)
    {
        printf("{");
        for(int j=0;j<n;j++)
        {
        if(counter&(1<<j))
        printf("%d ",a[j]);
        }
        printf("}");
        printf(", ");
        
    }
    printf("}");
    }