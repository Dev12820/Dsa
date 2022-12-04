#include<stdio.h>
struct dist
{
    int inch,feet;
};
int main()
{
    struct dist d1,d2,d3;
    printf("Enter the dist 1");
    scanf("%d%d",&d1.feet,&d1.inch);
    printf("Enter the dist 2");
    scanf("%d%d",&d2.feet,&d2.inch);
    d3.inch=(d1.inch+d2.inch)%12;
    d3.feet=d1.feet+d2.feet+(d1.inch+d2.inch)/12;
    printf("%d %d",d3.feet,d3.inch);

}