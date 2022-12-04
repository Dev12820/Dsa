#include<stdio.h>
struct com
{
    int real,img;
};
void main()
{
    struct com n1,n2,res;
    complex add(complex c1,complex c2){
complex res;
res.real=c1.real+c2.real;
res.img=c1.img+c2.img;
return res;
}
complex sub(complex c1,complex c2){
    complex res;
    res.real=c1.real-c2.real;
    res.img=c1.img-c2.img;
    return res;


}
complex mul(complex c1,complex c2){
    complex res;
res.real=c1.real*c2.real-c1.img*c2.img;
res.img=c1.real*c2.img+c1.img*c2.real;
return res;

    
}

}