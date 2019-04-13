#include <stdio.h>
int gof(int a,int b);
int main(){
	// Type your code here
  int x,y,z;
  scanf("%d%d%d",&x,&y,&z);
  int g=gof(x,y);
  printf("%d",gof(g,z));
  	return 0;
}
int gof(int a,int b)
{
  int m=0;
  if(a>b)
  {
    m=a;
  }
  else
  {
    m=b;
  }
  return m;
}