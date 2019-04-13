#include <stdio.h>
int gcdof(int a,int b);
int main() {
  
	//Type your code here
  int x,y,z;
  scanf("%d%d%d",&x,&y,&z);
  int g=gcdof(x,y);
  printf("%d",gcdof(g,z));
  	return 0;
}
int gcdof(int a,int b)
{
  int m=0,gcd=0;
  if(a<b)
  {
    m=a;
  }
  else
  {
    m=b;
  }
  while(m>1)
  {
    if((a%m==0)&&(b%m==0))
    {
      gcd=m;
      break;
    }
  }
  return gcd;
}