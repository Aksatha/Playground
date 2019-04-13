#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,b=0,temp,c,d=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    d++;
    temp=temp/10;
  }
  temp=n;
  while(temp != 0)
  {
    c=temp%10;
    b=b+ pow(c,d);
    temp=temp/10;
  }
  if(n==b)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}