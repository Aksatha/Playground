#include <stdio.h>
int main() {
	//Type your code
  int n,temp,fd,ld,sum;
  scanf("%d",&n);
  temp=n;
  ld=n%10;
  while(n>=10)
  {
    n /=10;
  }
  fd=n;
  sum=ld+fd;
  printf("%d",sum);
	return 0;
}