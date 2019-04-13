#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum=0,x;
  while(n != 0)
  {
    x=n%10;
    sum=sum+x;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}