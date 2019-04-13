#include<stdio.h>
int squarenumber(int n)
{
   int a;
  a=n*n;
  return a;
}
int main()
{
  int b,c;
 scanf("%d",&b);
 c=squarenumber(b);
  printf("%d",c);
}